package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class Test {

	// temporary test file to see if the decorator pattern works.
	public static void main(String[] args) {
		Tool c = new Concrete("concrete1");
		System.out.println(c.toString());
		System.out.println(c.getPrice());
		System.out.println(c.getCategory());
		Tool a = new ExtensionCord(c);
		System.out.println(a.toString());
		System.out.println(a.getPrice());
		System.out.println(a.getCategory());
		Tool b = new GearPackage(a);
		System.out.println(b.toString());
		System.out.println(b.getPrice());
		System.out.println(b.getCategory());
		ToolFactory tf = new ToolFactory();
		Tool d = tf.getTool("Woodwork", "ww1");
		System.out.println(d.toString());
		System.out.println(d.getPrice());
		System.out.println(d.getCategory());
		d.setDays(7);
		System.out.println(d.toString());
		System.out.println(d.getPrice());
		System.out.println(d.getCategory());
		Tool dd = new GearPackage(d);
		System.out.println(dd.toString());
		System.out.println(dd.getPrice());
		System.out.println(dd.getCategory());
		dd.setDays(5);
		System.out.println(dd.toString());
		System.out.println(dd.getPrice());
		System.out.println(dd.getCategory());
	}

}
