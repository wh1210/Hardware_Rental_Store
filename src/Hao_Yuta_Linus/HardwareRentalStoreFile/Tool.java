package Hao_Yuta_Linus.HardwareRentalStoreFile;

public abstract class Tool {
	protected String productName;
	protected double price;
	
	
	public Tool(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}


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
