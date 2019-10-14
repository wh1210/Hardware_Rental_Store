package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class ToolFactory {
	public Tool getTool(String toolType, String toolName) {
		if (toolType.equals("Concrete")) {
			return new Concrete(toolName);
		} else if (toolType.equals("Painting")) {
			return new Painting(toolName);
		} else if (toolType.equals("Plumbing")) {
			return new Plumbing(toolName);
		} else if (toolType.equals("Woodwork")) {
			return new Woodwork(toolName);
		} else {
			return new Yardwork(toolName);
		}
	}
}
