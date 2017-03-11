package example2;

/**
 * Created by Bram on 11-3-2017.
 */
public class Player implements Observer {
    private Subject subject;

    public Player(Subject subject) {
        this.subject = subject;
        // Add observer (this player) to subject
        subject.register(this);
    }

    @Override
    public void update(String gameInformation) {

        System.out.println("Player received new game information: " + gameInformation);
    }
}
