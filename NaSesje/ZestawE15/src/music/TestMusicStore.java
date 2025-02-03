package music;

import java.util.ArrayList;

public class TestMusicStore {
    public static void main(String[] args) {
        ArrayList<String> titles = new ArrayList<>();
        titles.add("A");
        titles.add("B");

        MusicStore musicStore1 = new MusicStore("MS1", "Olsztyn", titles);

        System.out.println(musicStore1.getName());
        System.out.println(musicStore1.getCity());

        musicStore1.addAlbum("LSIKJFD");
        musicStore1.removeAlbum("A");

        System.out.println(musicStore1);

        MusicStore vinylStore1 = new VinylStore("VS1", "Wrocław", new ArrayList<>(), 5);
        vinylStore1.addAlbum("Album 1");
        vinylStore1.addAlbum("Album 2");
        vinylStore1.removeAlbum("Album 1");
        System.out.println(vinylStore1);
    }
}
