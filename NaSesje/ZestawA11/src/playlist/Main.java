package playlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("s1", "a1", 60),
                new Song("s2", "a2", 25),
                new Song("s3", "a2", 120),
                new Song("s4", "s4", 180),
                new Song("s5", "s5", 65)
        };

        System.out.println("-> Przed sortowaniem: ");
        System.out.println(Arrays.toString(songs));


        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("\n\n-> Po posortowaniu: ");
        System.out.println(Arrays.toString(songs));
    }
}
