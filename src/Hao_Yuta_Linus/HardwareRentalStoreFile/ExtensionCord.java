package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;

public class ExtensionCord extends OptionalTool {
    protected Tool tool;

    public ExtensionCord(Tool tool) {
        super("");
        this.tool = tool;
    }

    @Override
    public double getPrice() {
        if (this.getCategory().equals(CONCRETE)) {
            return tool.getPrice() + CONCRETE_OPTION_RATE * EXTENSION_CODE_PRICE;
        } else if (this.getCategory().equals(PAINTING)) {
            return tool.getPrice() + PAINTING_OPTION_RATE * EXTENSION_CODE_PRICE;
        } else if (this.getCategory().equals(PLUMBING)) {
            return tool.getPrice() + PLUMBING_OPTION_RATE * EXTENSION_CODE_PRICE;
        } else if (this.getCategory().equals(WOODWORK)) {
            return tool.getPrice() + WOODWORK_OPTION_RATE * EXTENSION_CODE_PRICE;
        } else {
            return tool.getPrice() + YARDWORK_OPTION_RATE * EXTENSION_CODE_PRICE;
        }
    }

    @Override
    public String getName() {
        return tool.getName() + " + 1 extension cord";
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
