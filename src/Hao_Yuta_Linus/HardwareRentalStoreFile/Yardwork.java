package Hao_Yuta_Linus.HardwareRentalStoreFile;

import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.CONCRETE_PER_DAY;
import static Hao_Yuta_Linus.HardwareRentalStoreFile.Constants.YARDWORK_PER_DAY;

public class Yardwork extends Tool {

	public Yardwork(String productName, int day) {
		super(productName, YARDWORK_PER_DAY * day);
	}

	@Override
	public String getCategory() {
		return "Yardwork";
	}

	@Override
	public void setDays(int days) {
		this.price = YARDWORK_PER_DAY * days;
	}
}
