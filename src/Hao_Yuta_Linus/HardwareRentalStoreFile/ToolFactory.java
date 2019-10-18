package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.*;
/** Create a class ToolFactory base on Factory Patter
 * for encapsulation
 * @author Hao_Yuta_Linus
 * @since 2019-10-18
 */
public class ToolFactory {
    public Tool getTool(String toolType, String toolName) {
        if (toolType.equals(CONCRETE)) {
            return new Concrete(toolName);
        } else if (toolType.equals(PAINTING)) {
            return new Painting(toolName);
        } else if (toolType.equals(PLUMBING)) {
            return new Plumbing(toolName);
        } else if (toolType.equals(WOODWORK)) {
            return new Woodwork(toolName);
        } else {
            return new Yardwork(toolName);
        }
    }
}
