package playlist;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        if(o1.getArtist().compareTo(o2.getArtist()) != 0){
            return o1.getArtist().compareTo(o2.getArtist());    // chyba działa? idk
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
