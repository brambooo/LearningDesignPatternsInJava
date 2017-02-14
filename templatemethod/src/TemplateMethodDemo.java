/**
 * Created by Bram on 14-2-2017.
 */
public class TemplateMethodDemo {
    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();

        System.out.println("\n");

        Game tennisGame = new TennisGame();
        tennisGame.play();
    }
}
