package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class AccessoryKit extends OptionalTool {
	protected Tool tool;
	
	public AccessoryKit(Tool tool) {
		super("", 0.0);
		this.tool = tool;
	}
	
	@Override
	public double getPrice() {
		return tool.getPrice() + 2.0;
	}
	
	@Override
	public String getName() {
		return tool.getName() + " + 1 accessory Kit";
	}
	
	@Override
	public String toString() {
		return "name : " + this.getName() + ", price is: " + this.getPrice();
	}
}
