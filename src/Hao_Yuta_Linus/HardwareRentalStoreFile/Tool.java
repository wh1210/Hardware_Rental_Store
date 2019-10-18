package Hao_Yuta_Linus.HardwareRentalStoreFile;

/** Create a abstract class Tool for using by HardwareRentalStore
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
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

    // Method for get each tool's name
    public String getName() {
        return productName;
    }

    // Method for set each tool's name
    public String getProductName() {
        return productName;
    }

    // Method for get each tool's price
    public double getPrice() {
        return price;
    }

    // Method for get each tool's rental days
    public int getDay() {
        return day;
    }

    // Method for get each tool's renting person's name
    public String getRentingPersonName() {
        return rentingPersonName;
    }

    // Method for set each tool's renting person's name
    public void setRentingPersonName(String name) {
        rentingPersonName = name;
    }

    // // Method for print each tool's information
    @Override
    public String toString() {
        return this.getName() +
                "\n\t| Tool type : " + this.getCategory() +
                "\n\t| price : " + this.getPrice() +
                "\n\t| Renting day : " + this.getDay() +
                "\n\t| Rented by : " + this.getRentingPersonName();
    }
}
