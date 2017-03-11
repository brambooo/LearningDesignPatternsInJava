package example2;

/**
 * Created by Bram on 11-3-2017.
 * The observer update method is called when the example1.Subject changes
 */
public interface Observer {
    public void update(String gameInformation);
}
