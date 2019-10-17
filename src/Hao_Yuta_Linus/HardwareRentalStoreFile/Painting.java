package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PAINTING;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PAINTING_PER_DAY;

public class Painting extends Tool {

    public Painting(String productName) {
        super(productName);
    }

    @Override
    public String getCategory() {
        return PAINTING;
    }

    @Override
    public void setDays(int days) {
        this.price = PAINTING_PER_DAY * days;
        this.day = days;
    }
}
