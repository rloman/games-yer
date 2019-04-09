package nl.yer.games.wrappers;

import java.util.ArrayList;

public class GamePlayer {

    private ArrayList<Game> playedGames = new ArrayList<>();

    public void games(ArrayList<Integer> scores) {

        for(int score: scores) {
            Game g = new Game(score);

            this.playedGames.add(g);
        }

        Integer iObject = 3;

        // pre java 5
        Integer iObject2 = new Integer(3);

        int iObjectAsPrim = iObject2.intValue();



    }


}
