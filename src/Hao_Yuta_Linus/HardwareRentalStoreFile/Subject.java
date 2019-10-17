package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.ArrayList;

public abstract class Subject {
    protected boolean isNotification;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            if (isNotification)
                observers.get(i).update(this);
        }

        // If the subject finished notifications to all subject, call stopStore()
        if (isNotification) {
            stopStore();
        }
    }

    public abstract boolean[] getAvailability();

    public abstract void setAvailability(int index, Boolean value);

    public abstract int getNumAvailableTools();

    public abstract void announce(String std);

    public abstract void addRentedTool(Tool tool);

    public abstract void stopStore();
}
