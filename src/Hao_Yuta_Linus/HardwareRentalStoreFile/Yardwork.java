package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.YARDWORK;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.YARDWORK_PER_DAY;

public class Yardwork extends Tool {

    public Yardwork(String productName) {
        super(productName);
    }

    @Override
    public String getCategory() {
        return YARDWORK;
    }

    @Override
    public void setDays(int days) {
        this.price = YARDWORK_PER_DAY * days;
        this.day = days;
    }
}
