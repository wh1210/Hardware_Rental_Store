package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;


public class GearPackage extends OptionalTool {
	protected Tool tool;
	
	public GearPackage(Tool tool) {
		super("", 0.0);
		this.tool = tool;
	}
	
	@Override
	public double getPrice() {
		if (this.getCategory().equals("Concrete")) {
			return tool.getPrice() + CONCRETE_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE;
		} else if (this.getCategory().equals("Painting")){
			return tool.getPrice() + PAINTING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE;
		} else if (this.getCategory().equals("Plumbing")) {
			return tool.getPrice() + PLUMBING_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE;
		} else if (this.getCategory().equals("Woodwork")) {
			return tool.getPrice() + WOODWORK_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE;
		} else {
			return tool.getPrice() + YARDWORK_OPTION_RATE * PROTECTIVE_GEAR_PACKAGE_PRICE;
		}
	}
	
	@Override
	public String getName() {
		return tool.getName() + " + 1 protective gear package";
	}
	
	@Override
	public String toString() {
		return "name : " + this.getName() + ", price is: " + this.getPrice();
	}

	@Override
	public String getCategory() {
		return this.tool.getCategory();
	}
	
	@Override
	public void setDays(int days) {
		this.tool.setDays(days);
	}
}
