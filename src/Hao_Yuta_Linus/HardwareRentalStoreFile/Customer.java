package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.ArrayList;

public abstract class Customer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rentTool(Subject subject, int nights) {
        ArrayList<Tool> allTools = subject.getToolList();

        for (int i = 0; i < allTools.size(); i++) {
            if (allTools.get(i).getIsRentable()) {
                subject.announce(allTools.get(i).getName() + " is rented by " + getName() + " (" + Integer.toString(nights) + " days)");
                Tool rentedTool = generateRentedTool(allTools.get(i), nights);
                allTools.set(i, rentedTool);
                break;
            }
        }
    }

    private Tool generateRentedTool(Tool tool, int nights) {
        String className = tool.getClass().getSimpleName();
        Tool output = null;
        // TODO randomly add option (from 0 to 6)
        try {
            switch (className) {
                case "Painting":
                    output = new Painting(tool.getName(), nights);
                    break;
                case "Concrete":
                    output = new Concrete(tool.getName(), nights);
                    break;
                case "Plumbing":
                    output = new Plumbing(tool.getName(), nights);
                    break;
                case "Woodwork":
                    output = new Woodwork(tool.getName(), nights);
                    break;
                case "Yardwork":
                    output = new Yardwork(tool.getName(), nights);
                    break;
                default:
                    output = new Yardwork(tool.getName(), nights);
                    throw new RuntimeException("class name error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
}
