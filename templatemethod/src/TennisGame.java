/**
 * Created by Bram on 14-2-2017.
 */
public class TennisGame extends Game {
    @Override
    void initialize() {
        System.out.println("Tennis game loading.");
    }

    @Override
    void startPlay() {
        System.out.println("Tennis game started.");
    }

    @Override
    void endPlay() {
        System.out.println("Tennis game finished.");
    }
}
