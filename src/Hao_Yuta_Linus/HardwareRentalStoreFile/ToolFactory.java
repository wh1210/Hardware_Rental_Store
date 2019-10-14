package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class ToolFactory {
	public Tool getTool(String toolType, String toolName) {
		if (toolType.equals("Concrete")) {
			return new Concrete(toolName, 0);
		} else if (toolType.equals("Painting")) {
			return new Painting(toolName, 0);
		} else if (toolType.equals("Plumbing")) {
			return new Plumbing(toolName, 0);
		} else if (toolType.equals("Woodwork")) {
			return new Woodwork(toolName, 0);
		} else {
			return new Yardwork(toolName, 0);
		}
	}
}
