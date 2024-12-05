package zad1;

public class Bitmap extends ComputerGraphic{
    public Bitmap(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Bitmapa została załadowana");
    }

    @Override
    public void saveFile() {
        System.out.println("Bitmapa została zapisana");
    }
}
