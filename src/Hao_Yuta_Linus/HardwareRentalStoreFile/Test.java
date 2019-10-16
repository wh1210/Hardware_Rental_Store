package Hao_Yuta_Linus.HardwareRentalStoreFile;

public class Test {
    // temporary test file to see if the decorator pattern works.
    public static void main(String[] args) {
        decoratorTest();
        rentingTest();
    }

    private static void decoratorTest() {
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

    private static void rentingTest() {
        HardwareRentalStore store = new HardwareRentalStore();
        Observer business1 = new BusinessCustomer("business1");
        Observer casual1 = new CasualCustomer("casual1");
        Observer regular1 = new RegularCustomer("regular1");

        Observer business2 = new BusinessCustomer("business2");
        Observer casual2 = new CasualCustomer("casual2");
        Observer regular2 = new RegularCustomer("regular2");


        Observer business3 = new BusinessCustomer("business3");
        Observer casual3 = new CasualCustomer("casual3");
        Observer regular3 = new RegularCustomer("regular3");

        Observer business4 = new BusinessCustomer("business3");
        Observer casual4 = new CasualCustomer("casual3");
        Observer regular4 = new RegularCustomer("regular3");


        store.registerObserver(business1);
        store.registerObserver(casual1);
        store.registerObserver(regular1);

        store.registerObserver(business2);
        store.registerObserver(casual2);
        store.registerObserver(regular2);

        store.registerObserver(business3);
        store.registerObserver(casual3);
        store.registerObserver(regular3);

        store.registerObserver(business4);
        store.registerObserver(casual4);
        store.registerObserver(regular4);

        store.openStore();
    }
}
