package nl.yer.games.model.starter;

import nl.yer.games.model.Game;

public class Application {


    public static void main(String[] args) {

        int l = 45;
        Game game = new Game();

        int huidigelevel = 3;//game.start();

        System.out.println(huidigelevel);

        System.out.println(game.stop());

        game.setLevels(3); // 3 is hier het ARGUMENT

        String firstName = "Ray";

    }
}
