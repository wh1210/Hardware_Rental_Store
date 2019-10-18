package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PAINTING;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PAINTING_PER_DAY;
/** Create a inherited class base on Tool
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class Painting extends Tool {

    public Painting(String productName) {
        super(productName);
    }

    //Return the Painting's category
    @Override
    public String getCategory() {
        return PAINTING;
    }

    //Set the rent days for the Painting
    @Override
    public void setDays(int days) {
        this.price = PAINTING_PER_DAY * days;
        this.day = days;
    }
}
