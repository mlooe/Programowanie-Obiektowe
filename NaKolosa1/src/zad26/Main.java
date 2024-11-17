package zad26;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Double[] tab = {705.25, 100.0, 599.9, 2200.0, 239.9};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(tab));

        Computer c1 = new Computer("asdf", "a25", list);
        c1.setModel("C999");
        System.out.println(c1.toString());

        Laptop l1 = new Laptop("oijgr", "x200", list, 10.0);
        System.out.println(l1.toString());

        Desktop d1 = new Desktop("zxcv", "V1", list, "Full-tower");
        System.out.println(d1.toString());
    }
}
