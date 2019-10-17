package Hao_Yuta_Linus.HardwareRentalStoreFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
        // Randomly notify to random #observers
        Collections.shuffle(observers); // for random order
        Random r = new Random();
        int numNotification = r.nextInt(observers.size());

        for (int i = 0; i < numNotification; i++) {
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
