package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.WOODWORK_PER_DAY;

public class Woodwork extends Tool {

	public Woodwork(String productName, int day) {
		super(productName, WOODWORK_PER_DAY * day);
	}

}
