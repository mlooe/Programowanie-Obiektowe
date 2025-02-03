package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Song 3", "Artist 3", 2),
                new Song("Song 4", "Artist 2", 5),
                new Song("Song 2", "Artist 1", 4),
                new Song("Song 1", "Artist 2", 3),
        };

        System.out.println("Przed sortowaniem: ");
        for(Song s: songs) {
            System.out.println(s);
        }

        System.out.println("\nPo posortowaniu: ");
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        for(Song s: songs) {
            System.out.println(s);
        }

    }
}
