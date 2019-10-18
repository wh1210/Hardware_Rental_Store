package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.WOODWORK;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.WOODWORK_PER_DAY;
/** Create a inherited class base on Tool
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class Woodwork extends Tool {

    public Woodwork(String productName) {
        super(productName);
    }

    //Return the Woodwork's category
    @Override
    public String getCategory() {
        return WOODWORK;
    }

    //Set the rent days for the Woodwork
    @Override
    public void setDays(int days) {
        this.price = WOODWORK_PER_DAY * days;
        this.day = days;
    }
}
