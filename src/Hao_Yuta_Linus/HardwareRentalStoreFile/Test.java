package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class Test {

	// temporary test file to see if the decorator pattern works.
	public static void main(String[] args) {
		Tool c = new Concrete("concrete1", 2);
		System.out.println(c.toString());
		System.out.println(c.getPrice());
		Tool a = new ExtensionCord(c);
		System.out.println(a.toString());
		System.out.println(a.getPrice());
		Tool b = new GearPackage(a);
		System.out.println(b.toString());
		System.out.println(b.getPrice());
	}

}
