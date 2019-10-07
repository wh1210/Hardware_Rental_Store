package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.CONCRETE_PER_DAY;

public class Concrete extends Tool {

	public Concrete(String productName, int day) {
		super(productName, CONCRETE_PER_DAY * day);
	}

}
