package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        if(o2.getArtist().compareTo(o1.getArtist()) == 0){
            return o2.getTitle().compareTo(o1.getTitle());
        }
        return o2.getArtist().compareTo(o1.getArtist());
    }
}
