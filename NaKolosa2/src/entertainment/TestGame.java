package entertainment;

import zad4.AdventureGame;
import zad4.StrategyGame;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<Game>();

        games.add(new StrategyGame());
        games.add(new AdventureGame());
        games.add(new AdventureGame());
        games.add(new AdventureGame());
        games.add(new StrategyGame());

        for(Game g : games)
        {
            System.out.println(g.getRating());
        }
    }
}
