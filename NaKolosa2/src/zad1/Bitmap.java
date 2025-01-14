package zad1;

public class Bitmap extends ComputerGraphic{
    public Bitmap(int width, int height, String filename) {
        super(width, height, filename);
    }

    @Override
    public void loadFile() {
        System.out.println(filename + " została załadowana!");
    }

    @Override
    public void saveFile() {
        System.out.println(filename + " została zapisana");
    }
}
