package entertainment;

import zad4.AdventureGame;
import zad4.StrategyGame;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> testGames = new ArrayList<>();

        testGames.add(new StrategyGame());
        testGames.add(new StrategyGame());
        testGames.add(new AdventureGame());
        testGames.add(new AdventureGame());
        testGames.add(new AdventureGame());

        for(Game g:testGames){
            System.out.println(g.getRating());
        }
    }

}
