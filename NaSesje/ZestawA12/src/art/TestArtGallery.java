package art;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery artGallery1 = ArtGallery.getInstance("Galeria 1");
        ArtGallery artGallery2 = ArtGallery.getInstance("Galeria 2");
        ArtGallery artGallery3 = ArtGallery.getInstance("Galeria 3");

        System.out.println(artGallery1.getName());
        System.out.println(artGallery2.getName());
        System.out.println(artGallery3.getName());
    }
}
