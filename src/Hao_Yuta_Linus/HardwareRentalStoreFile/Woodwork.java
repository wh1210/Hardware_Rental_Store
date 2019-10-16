package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.WOODWORK_PER_DAY;

public class Woodwork extends Tool {

    public Woodwork(String productName) {
        super(productName);
    }

    @Override
    public String getCategory() {
        return "Woodwork";
    }

    @Override
    public void setDays(int days) {
        this.price = WOODWORK_PER_DAY * days;
        this.day = days;
    }
}
