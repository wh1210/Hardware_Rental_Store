package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class GearPackage extends OptionalTool {
	protected Tool tool;
	
	public GearPackage(Tool tool) {
		super("", 0.0);
		this.tool = tool;
	}
	
	@Override
	public double getPrice() {
		return tool.getPrice() + 4;
	}
	
	@Override
	public String getName() {
		return tool.getName() + " + 1 protective gear package";
	}
	
	@Override
	public String toString() {
		return "name : " + this.getName() + ", price is: " + this.getPrice();
	}
}
