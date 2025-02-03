package playlist;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Song 3", "Artist 3", 7),
                new Song("Song 5", "Artist 5", 2),
                new Song("Song 1", "Artist 1", 3),
                new Song("Song 4", "Artist 2", 1),
                new Song("Song 2", "Artist 2", 5),
        };

        System.out.println("Tabela przed sortowaniem: ");
        System.out.println(Arrays.toString(songs));


        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        System.out.println("\n\nTabela po posortowaniu: ");
        System.out.println(Arrays.toString(songs));
    }
}
