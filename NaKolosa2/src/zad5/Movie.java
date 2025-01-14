package zad5;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
    String title;
    String director;
    String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.title.length(), o.title.length());
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie("DDD", "B", "C"));
        movies.add(new Movie("BB", "E", "F"));
        movies.add(new Movie("CCCC", "C", "D"));
        movies.add(new Movie("A", "B", "C"));

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);

    }


}
