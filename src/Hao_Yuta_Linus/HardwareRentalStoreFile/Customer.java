package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.List;

public interface Customer {
	public String getName();
	
	public double getFee();
	
	public int rentDays();
	
	public void rentTools();
	
	public void addOptions();
	
	public List<Tool> toolsRented();
	
	public void returnTools();
}
