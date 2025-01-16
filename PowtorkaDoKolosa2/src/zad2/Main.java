package zad2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Title1", "RPG", LocalDate.of(2020, 6, 12));



        VideoGame game2 = game1.clone();

        game1.setReleaseDate(LocalDate.parse("2025-01-01"));

        System.out.println(game1.releaseDate);
        System.out.println(game2.releaseDate);
    }
}
