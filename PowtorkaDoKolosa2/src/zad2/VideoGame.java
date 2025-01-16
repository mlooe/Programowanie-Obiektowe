package zad2;

import java.time.LocalDate;

public class VideoGame implements Cloneable{
    String title;
    String genre;
    LocalDate releaseDate;

    public VideoGame(String title, String genre, LocalDate releaseDate){
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    public VideoGame clone() {
        try {
            VideoGame clone = (VideoGame) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }


    }
}
