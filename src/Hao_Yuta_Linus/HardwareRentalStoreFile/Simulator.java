package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.ArrayList;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;

public class Simulator {

    // This is a main function to simulate this store in 35 days.
    public static void main(String[] args) {
        HardwareRentalStore store = new HardwareRentalStore();

        ArrayList<Observer> customers = new ArrayList<>();
        CustomerFactory cf = new CustomerFactory();
        for (int i = 0; i < NUM_CUSTOMERS; i++) {
            customers.add(cf.getCustomer(CUSTOMER_TYPE[i], CUSTOMER_NAME[i]));
            store.registerObserver(customers.get(i));
        }

        store.openStore();

        // Unsubscribe observers
        for (int i = 0; i < NUM_CUSTOMERS; i++) {
            store.removeObserver(customers.get(i));
        }
    }

}
