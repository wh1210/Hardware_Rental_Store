package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.ArrayList;

public class HardwareRentalStore extends Subject {
    private ArrayList<Tool> tools;


    public HardwareRentalStore() {
        tools = new ArrayList<>();
        // call the helper function to initialize tools
        initializeTools();
    }

    // Help to initialize tools
    private void initializeTools() {
    	// TODO Use factory pattern
        tools.add(new Painting("Painting1", 0));
        tools.add(new Concrete("Concrete1", 0));
        tools.add(new Plumbing("Plumbing1", 0));
        tools.add(new Woodwork("Woodwork1", 0));
        tools.add(new Yardwork("Yardwork1", 0));

		tools.add(new Painting("Painting2", 0));
		tools.add(new Concrete("Concrete2", 0));
		tools.add(new Plumbing("Plumbing2", 0));
		tools.add(new Woodwork("Woodwork2", 0));
		tools.add(new Yardwork("Yardwork2", 0));

		tools.add(new Painting("Painting3", 0));
		tools.add(new Concrete("Concrete3", 0));
		tools.add(new Plumbing("Plumbing3", 0));
		tools.add(new Woodwork("Woodwork3", 0));
		tools.add(new Yardwork("Yardwork3", 0));

		tools.add(new Painting("Painting4", 0));
		tools.add(new Concrete("Concrete4", 0));
		tools.add(new Plumbing("Plumbing4", 0));
		tools.add(new Woodwork("Woodwork4", 0));
		tools.add(new Yardwork("Yardwork4", 0));

		tools.add(new Painting("Painting5", 0));
		tools.add(new Concrete("Concrete5", 0));
		tools.add(new Plumbing("Plumbing5", 0));
		tools.add(new Woodwork("Woodwork5", 0));
        for (int i = 0; i < tools.size(); i++) {
            tools.get(i).setIsRentable(true);
        }
    }


    public void openStore() {
        notifyObservers();
    }

    @Override
    public ArrayList<Tool> getToolList() {
        return tools;
    }

    @Override
    public int getNumRentableTools() {
        int num = 0;
        for (int i = 0; i < tools.size(); i++) {
            if (tools.get(i).getIsRentable())
                num++;
        }
        return num;
    }

    @Override
    public void announce(String std) {
        System.out.println(std);
    }
}
