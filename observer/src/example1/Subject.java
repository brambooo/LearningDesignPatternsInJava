package example1;

/**
 * Created by Bram on 11-3-2017.
 * This interface handles adding, deleting and updating all observers
 */
public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
