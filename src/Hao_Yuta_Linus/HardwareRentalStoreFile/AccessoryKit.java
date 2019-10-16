package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;


public class AccessoryKit extends OptionalTool {
    protected Tool tool;

    public AccessoryKit(Tool tool) {
        super("");
        this.tool = tool;
    }

    @Override
    public double getPrice() {
        if (this.getCategory().equals("Concrete")) {
            return tool.getPrice() + CONCRETE_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else if (this.getCategory().equals("Painting")) {
            return tool.getPrice() + PAINTING_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else if (this.getCategory().equals("Plumbing")) {
            return tool.getPrice() + PLUMBING_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else if (this.getCategory().equals("Woodwork")) {
            return tool.getPrice() + WOODWORK_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else {
            return tool.getPrice() + YARDWORK_OPTION_RATE * ACCESSORY_KIT_PRICE;
        }
    }

    @Override
    public String getName() {
        return tool.getName() + " + 1 accessory Kit";
    }

    @Override
    public String getCategory() {
        return this.tool.getCategory();
    }

    @Override
    public void setDays(int days) {
    }

    @Override
    public int getDay() {
        return tool.getDay();
    }


    @Override
    public String getProductName() {
        return tool.getProductName();
    }

    @Override
    public String getRentingPersonName() {
        return tool.getRentingPersonName();
    }

}
