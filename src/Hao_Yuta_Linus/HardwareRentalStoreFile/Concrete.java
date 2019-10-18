package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.CONCRETE;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.CONCRETE_PER_DAY;
/** Create a inherited class base on Tool
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class Concrete extends Tool {

    public Concrete(String productName) {
        super(productName);
    }

    //Return the Concrete's category
    @Override
    public String getCategory() {
        return CONCRETE;
    }

    //Set the rent days for the Concrete
    @Override
    public void setDays(int days) {
        this.price = CONCRETE_PER_DAY * days;
        this.day = days;
    }
}
