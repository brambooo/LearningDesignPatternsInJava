package example2;

/**
 * Created by Bram on 11-3-2017.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Subject
        GameMaster subject = new GameMaster();

        // Add player observer
        Player playerObserver1 = new Player(subject);

//        subject.setGameMaster("Brambo");
        subject.setGameInformation("Welcome to WoW!");

        // Add watcher observer
        Watcher watcherObserver1 = new Watcher(subject);

        subject.setGameInformation("New monsters added.");
    }
}
