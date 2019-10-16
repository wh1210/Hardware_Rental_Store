package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.Hashtable;
import java.util.Map;

public class HardwareRentalStore extends Subject {
    //    private ArrayList<Tool> tools;
    private Map<String, String> table = new Hashtable<>();


    private boolean[] availability = new boolean[24];


    public HardwareRentalStore() {
//        tools = new ArrayList<>();
        for (int i = 0; i < availability.length; i++) {
            availability[i] = true;
        }
        // call the helper function to initialize tools
//        initializeTools();
    }

    // Help to initialize tools
//    private void initializeTools() {
//    	// Initialize tools by ToolFactory (Factory Pattern)
//        ToolFactory tf = new ToolFactory();
//        tools.add(tf.getTool("Painting", "Pain1"));
//        tools.add(tf.getTool("Concrete", "Conc1"));
//        tools.add(tf.getTool("Plumbing", "Plum1"));
//        tools.add(tf.getTool("Woodwork", "Wood1"));
//        tools.add(tf.getTool("Yardwork", "Yard1"));
//
//        tools.add(tf.getTool("Painting", "Pain2"));
//        tools.add(tf.getTool("Concrete", "Conc2"));
//        tools.add(tf.getTool("Plumbing", "Plum2"));
//        tools.add(tf.getTool("Woodwork", "Wood2"));
//        tools.add(tf.getTool("Yardwork", "Yard2"));
//
//        tools.add(tf.getTool("Painting", "Pain3"));
//        tools.add(tf.getTool("Concrete", "Conc3"));
//        tools.add(tf.getTool("Plumbing", "Plum3"));
//        tools.add(tf.getTool("Woodwork", "Wood3"));
//        tools.add(tf.getTool("Yardwork", "Yard3"));
//
//        tools.add(tf.getTool("Painting", "Pain4"));
//        tools.add(tf.getTool("Concrete", "Conc4"));
//        tools.add(tf.getTool("Plumbing", "Plum4"));
//        tools.add(tf.getTool("Woodwork", "Wood4"));
//        tools.add(tf.getTool("Yardwork", "Yard4"));
//
//        tools.add(tf.getTool("Painting", "Pain5"));
//        tools.add(tf.getTool("Concrete", "Conc5"));
//        tools.add(tf.getTool("Plumbing", "Plum5"));
//        tools.add(tf.getTool("Woodwork", "Wood5"));
//    }


    public void openStore() {
        notifyObservers();
    }


    @Override
    public boolean[] getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(int index, Boolean value) {
        availability[index] = value;
    }

    @Override
    public int getNumRentableTools() {
        int num = 0;
        for (int i = 0; i < availability.length; i++) {
            if (availability[i])
                num++;
        }
        return num;
    }

    @Override
    public void announce(String std) {
        System.out.println(std);
    }
}
