package Hao_Yuta_Linus.HardwareRentalStoreFile;


import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.BUSINESS;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.CASUAL;

public class CustomerFactory {
    public Observer getCustomer(String customerType, String customerName) {
        if (customerType.equals(BUSINESS)) {
            return new BusinessCustomer(customerName);
        } else if (customerType.equals(CASUAL)) {
            return new CasualCustomer(customerName);
        } else {
            return new RegularCustomer(customerName);
        }
    }
}