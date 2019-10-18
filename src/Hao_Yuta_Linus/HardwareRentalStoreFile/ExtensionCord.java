package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;
/** Create a inherited class base on OptionalTool
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class ExtensionCord extends OptionalTool {
    protected Tool tool;

    public ExtensionCord(Tool tool) {
        super("");
        this.tool = tool;
    }

    // Method for getting price of ExtensionCord
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

    // Method for getting name of ExtensionCord
    @Override
    public String getName() {
        return tool.getName() + " + 1 extension cord";
    }

    // Return the ExtensionCord's category
    @Override
    public String getCategory() {
        return this.tool.getCategory();
    }

    // Set the rent days for ExtensionCord
    @Override
    public void setDays(int days) {
    }

    // Method for get each ExtensionCord's rental days
    @Override
    public int getDay() {
        return tool.getDay();
    }

    // Method for set each ExtensionCord's name
    @Override
    public String getProductName() {
        return tool.getProductName();
    }

    // Method for get each ExtensionCord's renting person's name
    @Override
    public String getRentingPersonName() {
        return tool.getRentingPersonName();
    }
}
