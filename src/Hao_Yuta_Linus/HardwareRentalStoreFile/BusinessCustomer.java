package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.NUM_NIGHTS_BY_BUSINESS;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.NUM_TOOLS_BY_BUSINESS;
/** Create a inherited class base on observer
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class BusinessCustomer extends Customer implements Observer {


    BusinessCustomer(String name) {
        super(name);
    }

    // update rent tools by Business Customer
    @Override
    public void update(Subject subject) {
        if (NUM_TOOLS_BY_BUSINESS <= subject.getNumAvailableTools()) {
            for (int i = 0; i < NUM_TOOLS_BY_BUSINESS; i++) {
                rentTool(subject, NUM_NIGHTS_BY_BUSINESS);
            }
        }
    }
}
