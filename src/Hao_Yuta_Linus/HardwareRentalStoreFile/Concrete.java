package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.CONCRETE_PER_DAY;

public class Concrete extends Tool {

    public Concrete(String productName) {
        super(productName);
    }

    @Override
    public String getCategory() {
        return "Concrete";
    }

    @Override
    public void setDays(int days) {
        this.price = CONCRETE_PER_DAY * days;
    }
}
