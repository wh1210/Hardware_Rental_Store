package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PLUMBING;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PLUMBING_PER_DAY;
/** Create a inherited class base on Tool
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class Plumbing extends Tool {

    public Plumbing(String productName) {
        super(productName);
    }

    //Return the Plumbing's category
    @Override
    public String getCategory() {
        return PLUMBING;
    }

    //Set the rent days for the Plumbing
    @Override
    public void setDays(int days) {
        this.price = PLUMBING_PER_DAY * days;
        this.day = days;
    }

}
