package Hao_Yuta_Linus.HardwareRentalStoreFile;

public abstract class Tool {
    protected String productName;
    protected double price;
    private Boolean isRentable;


    public Tool(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.isRentable = false;
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

    public Boolean getIsRentable() {
        return isRentable;
    }

    public void setIsRentable(Boolean vl) {
        isRentable = vl;
    }
}
