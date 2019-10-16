package Hao_Yuta_Linus.HardwareRentalStoreFile;

public abstract class Tool {
    protected String productName;
    protected double price;
    protected int day;
    protected String rentingPersonName;

    public Tool(String productName) {
        this.productName = productName;
        this.price = 0;
    }

    public Tool(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Return the tool's category.
    public abstract String getCategory();

    // Set the rent days for the given tool
    public abstract void setDays(int days);

    public  void setRentingPersonName(String name){
        rentingPersonName = name;
    }

    public String getName() {
        return productName;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
    public int getDay(){ return day; }
    public String getRentingPersonName(){
        return rentingPersonName;}

    @Override
    public String toString() {
        return this.getName() +
                "\n\t| Tool type : " + this.getCategory() +
                "\n\t| price : " + this.getPrice() +
                "\n\t| Renting day : " + this.getDay() +
                "\n\t| Rented by : " + this.getRentingPersonName();
    }
}
