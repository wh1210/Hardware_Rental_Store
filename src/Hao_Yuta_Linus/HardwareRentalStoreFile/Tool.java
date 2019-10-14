package Hao_Yuta_Linus.HardwareRentalStoreFile;

public abstract class Tool {
	protected String productName;
	protected double price;
	
	
	public Tool(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	// Return the tool's category.
	public abstract String getCategory();
	
	// Set the rent days for the given tool
	public abstract void setDays(int days);


	public String getName() {
		return productName;
	}


	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "name : " + this.getName() + ", price is: " + this.getPrice();
	}
}
