package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<ComputerGraphic> computerGraphics = new ArrayList<>();
        computerGraphics.add(new Vector(2, 3, "Wektor 1"));
        computerGraphics.add(new Vector(5, 5, "Wektor 2"));
        computerGraphics.add(new Vector(7, 11, "Wektor 3"));
        computerGraphics.add(new Bitmap(3, 5, "Bitmapa 1"));
        computerGraphics.add(new Bitmap(6, 8, "Bitmapa 2"));
        computerGraphics.add(new Bitmap(12, 15, "Bitmapa 3"));

        for(ComputerGraphic cg : computerGraphics)
        {
            cg.loadFile();
            cg.saveFile();
        }

    }
}
