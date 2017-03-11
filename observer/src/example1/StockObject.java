package example1;

import java.util.ArrayList;

/**
 * Created by Bram on 11-3-2017.
 * Uses the example1.Subject interface to update all Observers
 */
public class StockObject implements  Subject {


    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockObject(){
        // Creates an ArrayList to hold all observers
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        // Adds a new observer to the ArrayList
        observers.add(newObserver);

    }

    public void unregister(Observer deleteObserver) {
        // Get the index of the observer to delete
        int observerIndex = observers.indexOf(deleteObserver);

        System.out.println("example1.Observer " + (observerIndex+1) + " deleted");
        // Removes observer from the ArrayList
        observers.remove(observerIndex);

    }

    public void notifyObserver() {

        // Cycle through all observers and notifies them of
        // price changes

        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes

    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();

    }

    public void setAAPLPrice(double newAAPLPrice){
        this.aaplPrice = newAAPLPrice;
        notifyObserver();

    }

    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();

    }

}
