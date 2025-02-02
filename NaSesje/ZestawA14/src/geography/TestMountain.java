package geography;

import java.util.ArrayList;

public class TestMountain {
    public static void main(String[] args) {
        ArrayList<Double> h1 = new ArrayList<>();

        //Góra oryginalna:
        h1.add(700.0);
        h1.add(1500.0);
        h1.add(250.0);
        h1.add(1000.0);
        // ----------

        Mountain mountain = new Mountain("Mountain 1", h1);
        Mountain cloneMountain = mountain.clone();

        h1.removeFirst();
        h1.removeLast();
        h1.add(500.0);

        mountain.setHeights(h1);

        System.out.println(mountain); // Góra oryginalna po lekkiej zmianie
        System.out.println(cloneMountain);   // Klon góry oryginalnej (wysokości nie zostały zmienione)
    }
}
