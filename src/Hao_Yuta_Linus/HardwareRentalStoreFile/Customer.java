package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.Random;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.TOOL_NAME;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.TOOL_TYPE;
/** Create a abstract class Customer subject by HardwareRentalStore
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public abstract class Customer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method for customer to rental availability tools
    public void rentTool(Subject subject, int nights) {
        boolean[] availability = subject.getAvailability();
        for (int i = 0; i < availability.length; i++) {
            if (availability[i]) {
                Tool rentedTool = generateRentedTool(nights, i);
                subject.addRentedTool(rentedTool);
                subject.setAvailability(i, false);
                break;
            }
        }
    }

    // Method for generate tools from ToolFactory to customer
    private Tool generateRentedTool(int nights, int toolId) {
        ToolFactory tf = new ToolFactory();
        Tool tool = tf.getTool(TOOL_TYPE[toolId], TOOL_NAME[toolId]);
        tool.setDays(nights);
        tool.setRentingPersonName(name);
        return randomlyAddOption(tool);
    }

    // Randomly add option (from 0 to 6) of optional tools for customer
    private Tool randomlyAddOption(Tool tool) {
        Random ran = new Random();
        int numOptions = ran.nextInt(7);
        for (int i = 0; i < numOptions; i++) {
            int optionalTool = ran.nextInt(2);
            switch (optionalTool) {
                case 0:
                    tool = new ExtensionCord(tool);
                    break;
                case 1:
                    tool = new GearPackage(tool);
                    break;
                default:
                    tool = new AccessoryKit(tool);
                    break;
            }
        }
        return tool;
    }
}
