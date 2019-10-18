package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.YARDWORK;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.YARDWORK_PER_DAY;
/** Create a inherited class base on Tool
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class Yardwork extends Tool {

    public Yardwork(String productName) {
        super(productName);
    }

    //Return the Yardwork's category
    @Override
    public String getCategory() {
        return YARDWORK;
    }

    //Set the rent days for the Yardwork
    @Override
    public void setDays(int days) {
        this.price = YARDWORK_PER_DAY * days;
        this.day = days;
    }
}
