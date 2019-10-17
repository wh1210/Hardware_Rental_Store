package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;

public class HardwareRentalStore extends Subject {
    private boolean[] availability = new boolean[NUM_TOOLS];
    private int day = 1;
    private double totalSales = 0;
    private DecimalFormat salesFormat = new DecimalFormat("$#.#");
    private ArrayList<Tool> todayRentals = new ArrayList<>();       // List of tools which are rented the day
    private ArrayList<Tool> activeRentals = new ArrayList<>();      // List of all active rented tools
    private ArrayList<Tool> completedRentals = new ArrayList<>();   // List of all tools which are returned
    private ArrayList<Integer> remainingDays = new ArrayList<>();   // List of remainig days which are correspond to allRentals

    public HardwareRentalStore() {
        Arrays.fill(availability, true);
        // Initialize format
        salesFormat.setMinimumFractionDigits(2);
        salesFormat.setMaximumFractionDigits(2);
    }

    public void openStore() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++ Day " + day + " starts ++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        if (day != 1) {
            prepareForOpening();
        }
        isNotification = true;
        notifyObservers();
    }


    @Override
    public boolean[] getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(int index, Boolean value) {
        availability[index] = value;
        int numAvailability = getNumAvailableTools();
        if (numAvailability == 0) {
            stopStore();
        }
    }

    @Override
    public int getNumAvailableTools() {
        int num = 0;
        for (boolean b : availability) {
            if (b)
                num++;
        }
        return num;
    }

    @Override
    public void announce(String std) {
        System.out.println(std);
    }

    @Override
    public void addRentedTool(Tool tool) {
        todayRentals.add(tool);
    }

    @Override
    public void stopStore() {
        // Terminate the day because
        // 1) there are no available tools
        // or
        // 2) all customer visited one time on the day
        isNotification = false;
        reportSales();
        prepareForNextDay();
        reportActiveAndLeftRentals();

        if (day == MAX_DAYS) {
            reportFinal();
        }

        day++;
        if (day <= MAX_DAYS) {
            openStore();
        }
    }

    private void reportSales() {
        double sales = 0;
        for (int i = 0; i < todayRentals.size(); i++) {
            sales += todayRentals.get(i).getPrice();
        }
        System.out.println("Sales (Day " + day + "): " + salesFormat.format(sales));
        totalSales += sales;
    }

    private void reportActiveAndLeftRentals() {
        System.out.println("\n========= Active Rental List =========");
        for (int i = 0; i < activeRentals.size(); i++) {
            System.out.println(activeRentals.get(i).getProductName() + " (" + activeRentals.get(i).getCategory() + ") rented by " + activeRentals.get(i).getRentingPersonName());
        }
        System.out.println("#Active rentals = " + activeRentals.size());
        System.out.println("=====================================\n");

        System.out.println("\n--------- Left Rental List ---------");
        int numLeft = 0;
        for (int i = 0; i < NUM_TOOLS; i++) {
            if (availability[i]) {
                numLeft++;
                System.out.println(TOOL_NAME[i] + " (" + TOOL_TYPE[i] + ")");
            }
        }
        System.out.println("#Left rentals = " + numLeft);
        System.out.println("------------------------------------");
    }

    private void prepareForNextDay() {

        for (int i = 0; i < todayRentals.size(); i++) {
            activeRentals.add(todayRentals.get(i)); // Add todayRentals to allRentals
            remainingDays.add(todayRentals.get(i).getDay()); // Add renting day to remainingDays
        }
        todayRentals.clear();
    }

    private void prepareForOpening() {
        // Update remainingDays
        for (int i = 0; i < activeRentals.size(); i++) {
            remainingDays.set(i, remainingDays.get(i) - 1);
        }

        // Update availability, remainingDays, and allRentals if any element in remainingDays is equal to 0
        ArrayList<String> removeProductName = new ArrayList<>(); // List of product names which are deleted
        for (int i = 0; i < activeRentals.size(); i++) {
            if (remainingDays.get(i) == 0) {
                removeProductName.add(activeRentals.get(i).getProductName());
            }
        }

        // Change availability
        for (int i = 0; i < removeProductName.size(); i++) {

            String productName = removeProductName.get(i);
            for (int j = 0; j < NUM_TOOLS; j++) {
                if (TOOL_NAME[j].equals(productName)) {
                    availability[j] = true;
                }
            }
        }

        // Delete corresponding elements in remainingDays
        Iterator<Integer> it1 = remainingDays.iterator();
        while (it1.hasNext()) {
            int value = it1.next();
            if (value == 0) it1.remove();
        }

        // Report completed rentals
        System.out.println("\n~~~~~~~~~ Completed Rental List ~~~~~~~~~");
        for (int i = 0; i < activeRentals.size(); i++) {
            for (int j = 0; j < removeProductName.size(); j++) {
                if (activeRentals.get(i).getProductName().equals(removeProductName.get(j))) {
                    System.out.println(activeRentals.get(i).toString());
                }
            }
        }
        System.out.println("#Completed rentals = " + removeProductName.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Delete corresponding elements in allRentals
        Iterator<Tool> it = activeRentals.iterator();
        while (it.hasNext()) {
            Tool value = it.next();
            for (int i = 0; i < removeProductName.size(); i++) {
                if (value.getProductName().equals(removeProductName.get(i))) {
                    completedRentals.add(value);
                    it.remove();
                }

            }
        }
    }

    private void reportFinal() {
        System.out.println("\n\n##############################################");
        System.out.println("################# SUMMARY ####################");
        System.out.println("##############################################\n");


        // Add active rentals in completedRentals
        for (int i = 0; i < activeRentals.size(); i++) {
            completedRentals.add(activeRentals.get(i));
        }


        System.out.println("Total sales = " + salesFormat.format(totalSales));
        System.out.println("\n");

        System.out.println("#Rentals = " + completedRentals.size());

        // Count each tool type
        int numPainting = 0;
        int numConcrete = 0;
        int numPlumbing = 0;
        int numWoodwork = 0;
        int numYardwork = 0;
        for (int i = 0; i < completedRentals.size(); i++) {
            completedRentals.get(i).getRentingPersonName();
            switch (completedRentals.get(i).getCategory()) {
                case PAINTING:
                    numPainting++;
                    break;
                case CONCRETE:
                    numConcrete++;
                    break;
                case PLUMBING:
                    numPlumbing++;
                    break;
                case WOODWORK:
                    numWoodwork++;
                    break;
                case YARDWORK:
                    numYardwork++;
                    break;
            }
        }
        System.out.println("\t#Paintings = " + numPainting);
        System.out.println("\t#Concretes = " + numConcrete);
        System.out.println("\t#Plumbings = " + numPlumbing);
        System.out.println("\t#Woodwords = " + numWoodwork);
        System.out.println("\t#Yardworks = " + numYardwork);

        // Count each customer's type
        int numCasual = 0;
        int numBusiness = 0;
        int numRegular = 0;
        for (int i = 0; i < completedRentals.size(); i++) {
            for (int j = 0; j < NUM_CUSTOMERS; j++) {
                if (completedRentals.get(i).getRentingPersonName().equals(CUSTOMER_NAME[j])) {
                    switch (CUSTOMER_TYPE[j]) {
                        case CASUAL:
                            numCasual++;
                            break;
                        case BUSINESS:
                            numBusiness++;
                            break;
                        case REGULAR:
                            numRegular++;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        System.out.println("\n");
        int totalCustomers = numCasual + numBusiness + numRegular;
        System.out.println("#Customers = " + totalCustomers);
        System.out.println("\t#Casual Customers = " + numCasual);
        System.out.println("\t#Business Customers = " + numBusiness);
        System.out.println("\t#Regular Customers = " + numRegular);
    }
}
