package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.Random;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.TOOL_NAME;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.TOOL_TYPE;

public abstract class Customer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rentTool(Subject subject, int nights) {
        boolean[] availability = subject.getAvailability();
        for (int i = 0; i < availability.length; i++) {
            if (availability[i]) {
                subject.announce(TOOL_NAME[i] + " is rented by " + getName() + " (" + nights + " days)");
                Tool rentedTool = generateRentedTool(nights, i);
                subject.setAvailability(i, false);
                break;
            }
        }
    }

    private Tool generateRentedTool(int nights, int toolId) {
        ToolFactory tf = new ToolFactory();
        Tool tool = tf.getTool(TOOL_TYPE[toolId], TOOL_NAME[toolId]);
        tool.setDays(nights);
        return randomlyAddOption(tool);
    }

    // TODO randomly add option (from 0 to 6)
    // TODO correctly work?
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
