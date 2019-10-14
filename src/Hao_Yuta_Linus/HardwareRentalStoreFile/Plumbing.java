package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.PLUMBING_PER_DAY;

public class Plumbing extends Tool {

	public Plumbing(String productName, int day) {
		super(productName, PLUMBING_PER_DAY * day);
	}

	@Override
	public String getCategory() {
		return "Plumbing";
	}

	@Override
	public void setDays(int days) {
		this.price = PLUMBING_PER_DAY * days;
	}

}
