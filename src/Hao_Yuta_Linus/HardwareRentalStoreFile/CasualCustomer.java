package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.Random;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;
/** Create a inherited class base on observer
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class CasualCustomer extends Customer implements Observer {


    CasualCustomer(String name) {
        super(name);
    }

    @Override
    // update rental tools with random tools and night for Casual Customer
    public void update(Subject subject) {
        // Generate random #tools and #nights
        Random r = new Random();
        int numTools = r.nextInt((MAX_NUM_TOOLS_BY_CASUAL - MIN_NUM_TOOLS_BY_CASUAL) + 1) + MIN_NUM_TOOLS_BY_CASUAL;
        int numNights = r.nextInt((MAX_NUM_NIGHTS_BY_CASUAL - MIN_NUM_NIGHTS_BY_CASUAL) + 1) + MIN_NUM_NIGHTS_BY_CASUAL;

        if (numTools <= subject.getNumAvailableTools()) {
            for (int i = 0; i < numTools; i++) {
                rentTool(subject, numNights);
            }
        }
    }
}
