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
        observerTest();
    }

    private static void observerTest() {
        HardwareRentalStore store = new HardwareRentalStore();
        Observer business1 = new BusinessCustomer("business1");
        Observer casual1 = new CasualCustomer("casual1");
		Observer regular1 = new RegularCustomer("regular1");

		store.registerObserver(business1);
        store.registerObserver(casual1);
		store.registerObserver(regular1);
        store.openStore();
    }
}
