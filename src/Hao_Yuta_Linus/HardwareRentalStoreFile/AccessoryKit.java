package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;
/** Create a inherited class base on OptionalTool
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */

public class AccessoryKit extends OptionalTool {
    protected Tool tool;

    public AccessoryKit(Tool tool) {
        super("");
        this.tool = tool;
    }


    // Method for getting price of AccessoryKit
    @Override
    public double getPrice() {
        if (this.getCategory().equals(CONCRETE)) {
            return tool.getPrice() + CONCRETE_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else if (this.getCategory().equals(PAINTING)) {
            return tool.getPrice() + PAINTING_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else if (this.getCategory().equals(PLUMBING)) {
            return tool.getPrice() + PLUMBING_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else if (this.getCategory().equals(WOODWORK)) {
            return tool.getPrice() + WOODWORK_OPTION_RATE * ACCESSORY_KIT_PRICE;
        } else {
            return tool.getPrice() + YARDWORK_OPTION_RATE * ACCESSORY_KIT_PRICE;
        }
    }

    // Method for getting name of AccessoryKit
    @Override
    public String getName() {
        return tool.getName() + " + 1 accessory Kit";
    }

    // Return the AccessoryKit's category
    @Override
    public String getCategory() {
        return this.tool.getCategory();
    }

    // Set the rent days for AccessoryKit
    @Override
    public void setDays(int days) {
    }

    // Method for get each AccessoryKit's rental days
    @Override
    public int getDay() {
        return tool.getDay();
    }

    // Method for set each AccessoryKit's name
    @Override
    public String getProductName() {
        return tool.getProductName();
    }

    // Method for get each AccessoryKit's renting person's name
    @Override
    public String getRentingPersonName() {
        return tool.getRentingPersonName();
    }

}
