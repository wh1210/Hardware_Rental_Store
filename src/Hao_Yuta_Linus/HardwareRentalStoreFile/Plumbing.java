package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PLUMBING;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PLUMBING_PER_DAY;

public class Plumbing extends Tool {

    public Plumbing(String productName) {
        super(productName);
    }

    @Override
    public String getCategory() {
        return PLUMBING;
    }

    @Override
    public void setDays(int days) {
        this.price = PLUMBING_PER_DAY * days;
        this.day = days;
    }

}
