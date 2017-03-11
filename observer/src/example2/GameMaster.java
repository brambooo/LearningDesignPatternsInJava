package example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bram on 11-3-2017.
 * GameMaster is the subject and is going to notify all players and watchers (Observers)
 */
public class GameMaster implements Subject {
    private List<Observer> observers;
    private String currentGameMaster;
    private String currentGameInformation;

    public GameMaster() {
        // Initialize observers list
        this.currentGameMaster = "BOT";
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer " + observerIndex + " removed.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(currentGameInformation);
        }
    }

    public void setGameMaster(String name) {
        this.currentGameMaster = name;
    }

    public void setGameInformation(String info) {
        this.currentGameInformation = "| GAME MASTER [" + currentGameMaster + "] | updated game: " + info;
        notifyObserver();
    }

}
