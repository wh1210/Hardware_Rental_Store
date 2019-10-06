package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class ExtensionCord extends OptionalTool {
	protected Tool tool;
	
	public ExtensionCord(Tool tool) {
		super("", 0.0);
		this.tool = tool;
	}
	
	@Override
	public double getPrice() {
		return tool.getPrice() + 1.5;
	}
	
	@Override
	public String getName() {
		return tool.getName() + " + 1 extension cord";
	}
	
	@Override
	public String toString() {
		return "name : " + this.getName() + ", price is: " + this.getPrice();
	}
}
