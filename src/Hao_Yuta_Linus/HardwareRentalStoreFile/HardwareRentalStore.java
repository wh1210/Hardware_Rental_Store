package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;

public class HardwareRentalStore extends Subject {
    private boolean[] availability = new boolean[NUM_TOOLS];
    private int day = 1;
    private ArrayList<Tool> todayRentals = new ArrayList<>();       // List of tools which are rented the day
    private ArrayList<Tool> activeRentals = new ArrayList<>();         // List of all active rented tools
    private ArrayList<Integer> remainingDays = new ArrayList<>();   // List of remainig days which are correspond to allRentals


    public HardwareRentalStore() {
        Arrays.fill(availability, true);
    }

    public void openStore() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++" );
        System.out.println("++++++++++++++++++++ Day " + day + " starts ++++++++++++++++++++" );
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" );

        if(day != 1) {
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
        if(numAvailability == 0){
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
        day++;
        if(day <= MAX_DAYS){
            openStore();
        }
    }

    private void reportSales(){
        double totalSales = 0;
        for(int i = 0; i < todayRentals.size(); i++){
            totalSales += todayRentals.get(i).getPrice();
        }
        System.out.println("Sales (Day "+ day + "): " + totalSales);
    }

    private  void reportActiveAndLeftRentals(){
        System.out.println("\n========= Active Rental List =========");
        for(int i = 0; i < activeRentals.size(); i++){
            System.out.println(activeRentals.get(i).getProductName() + " (" + activeRentals.get(i).getCategory() + ") rented by " + activeRentals.get(i).getRentingPersonName());
        }
        System.out.println("#Active rentals = " + activeRentals.size());
        System.out.println("=====================================\n");

        System.out.println("\n--------- Left Rental List ---------");
        int numLeft = 0;
        for(int i = 0; i < NUM_TOOLS; i++){
            if(availability[i]){
                numLeft++;
                System.out.println(TOOL_NAME[i] + " (" + TOOL_TYPE[i] + ")");
            }
        }
        System.out.println("#Left rentals = " + numLeft);
        System.out.println("------------------------------------");
    }

    private void prepareForNextDay(){

        for(int i = 0; i < todayRentals.size(); i++){
            activeRentals.add(todayRentals.get(i)); // Add todayRentals to allRentals
            remainingDays.add(todayRentals.get(i).getDay()); // Add renting day to remainingDays
        }
        todayRentals.clear();
    }

    private void prepareForOpening(){
        // Update remainingDays
        for(int i = 0; i < activeRentals.size(); i++){
            remainingDays.set(i, remainingDays.get(i) -1);
        }

        // Update availability, remainingDays, and allRentals if any element in remainingDays is equal to 0
        ArrayList<String> removeProductName = new ArrayList<>(); // List of product names which are deleted
        for(int i = 0; i < activeRentals.size(); i++){
            if(remainingDays.get(i) == 0) {
                removeProductName.add(activeRentals.get(i).getProductName());
            }
        }

        // Change availability
        for(int i = 0; i < removeProductName.size(); i++){

            String productName = removeProductName.get(i);
            for(int j = 0; j < NUM_TOOLS; j++){
                if(TOOL_NAME[j].equals(productName)){
                    availability[j] = true;
                }
            }
        }

        // Delete corresponding elements in remainingDays
        Iterator<Integer> it1 = remainingDays.iterator();
        while(it1.hasNext()){
            int value = it1.next();
            if(value == 0) it1.remove();
        }

        // Report completed rentals
        System.out.println("\n~~~~~~~~~ Completed Rental List ~~~~~~~~~");
        for(int i = 0; i< activeRentals.size(); i++){
            for(int j = 0; j < removeProductName.size(); j++){
                if(activeRentals.get(i).getProductName().equals(removeProductName.get(j))){
                    System.out.println(activeRentals.get(i).toString());
                }
            }
        }
        System.out.println("#Completed rentals = " + removeProductName.size());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Delete corresponding elements in allRentals
        Iterator<Tool> it = activeRentals.iterator();
        while(it.hasNext()){
            Tool value = it.next();
            for(int i = 0; i < removeProductName.size(); i++) {
                if (value.getProductName().equals(removeProductName.get(i)))
                    it.remove();
            }
        }
    }
}
