package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.YARDWORK_PER_DAY;

public class Yardwork extends Tool {

	public Yardwork(String productName, int day) {
		super(productName, YARDWORK_PER_DAY * day);
	}

}
