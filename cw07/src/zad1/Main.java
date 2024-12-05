package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComputerGraphic> computerGraphics = new ArrayList<>();
        computerGraphics.add(new Vector(5, 10, "Wektor 1"));
        computerGraphics.add(new Vector(10, 20, "Wektor 2"));
        computerGraphics.add(new Vector(15, 25, "Wektor 3"));
        computerGraphics.add(new Bitmap(100, 100, "Bitmapa 1"));
        computerGraphics.add(new Bitmap(200, 200, "Bitmapa 2"));
        computerGraphics.add(new Bitmap(500, 500, "Bitmapa 3"));

        for(ComputerGraphic cg:computerGraphics){
            cg.loadFile();
            cg.saveFile();
        }
    }
}
