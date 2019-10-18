package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.Random;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;
/** Create a inherited class base on observer
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class RegularCustomer extends Customer implements Observer {
    RegularCustomer(String name) {
        super(name);
    }

    @Override
    // update rental tools with random tools and nights for Regular Customer
    public void update(Subject subject) {
        // Generate random #tools and #nights
        Random r = new Random();
        int numTools = r.nextInt((MAX_NUM_TOOLS_BY_REGULAR - MIN_NUM_TOOLS_BY_REGULAR) + 1) + MIN_NUM_TOOLS_BY_REGULAR;
        int numNights = r.nextInt((MAX_NUM_NIGHTS_BY_REGULAR - MIN_NUM_NIGHTS_BY_REGULAR) + 1) + MIN_NUM_NIGHTS_BY_REGULAR;

        if (numTools <= subject.getNumAvailableTools()) {
            for (int i = 0; i < numTools; i++) {
                rentTool(subject, numNights);
            }
        }
    }
}
