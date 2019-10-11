package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.NUM_NIGHTS_BY_BUSINESS;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.NUM_TOOLS_BY_BUSINESS;

public class BusinessCustomer extends Customer implements Observer {


    BusinessCustomer(String name) {
        super(name);
    }

    @Override
    public void update(Subject subject) {
        if (NUM_TOOLS_BY_BUSINESS <= subject.getNumRentableTools()) {
            for (int i = 0; i < NUM_TOOLS_BY_BUSINESS; i++) {
                rentTool(subject, NUM_NIGHTS_BY_BUSINESS);
            }
        }
    }
}
