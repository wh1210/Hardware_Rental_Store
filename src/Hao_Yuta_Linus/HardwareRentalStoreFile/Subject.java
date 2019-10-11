package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }

    public abstract ArrayList<Tool> getToolList();

    public abstract int getNumRentableTools();

    public abstract void announce(String std);
}
