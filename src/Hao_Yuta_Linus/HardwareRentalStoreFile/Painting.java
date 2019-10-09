package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PAINTING_PER_DAY;

public class Painting extends Tool {

	public Painting(String productName, int day) {
		super(productName, PAINTING_PER_DAY * day);
	}
}
