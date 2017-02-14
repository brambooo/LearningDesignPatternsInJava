/**
 * Created by Bram on 14-2-2017.
 */
public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Football game loading.");
    }

    @Override
    void startPlay() {
        System.out.println("Football game started.");
    }

    @Override
    void endPlay() {
        System.out.println("Football game finished.");
    }
}
