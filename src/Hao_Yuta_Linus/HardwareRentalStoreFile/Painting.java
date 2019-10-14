package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.CONCRETE_PER_DAY;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PAINTING_PER_DAY;

public class Painting extends Tool {

	public Painting(String productName, int day) {
		super(productName, PAINTING_PER_DAY * day);
	}

	@Override
	public String getCategory() {
		return "Painting";
	}
	
	@Override
	public void setDays(int days) {
		this.price = PAINTING_PER_DAY * days;
	}
}
