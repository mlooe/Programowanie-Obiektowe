package space;

import java.util.ArrayList;

public class TestSpacecraft {
    public static void main(String[] args) {
        ArrayList<Double> ratings1 = new ArrayList<>();
        ratings1.add(5.5);
        ratings1.add(3.0);
        ratings1.add(6.9);

        Spacecraft s1 = new Spacecraft("Spacecraft 1", "Manufacturer 1", ratings1);

        ArrayList<Double> ratings2 = new ArrayList<>();
        ratings2.add(8.0);
        ratings2.add(7.0);
        ratings2.add(6.0);

        Spacecraft s2 = new Spacecraft("Spacecraft 2", "Manufacturer 2", ratings2);

        System.out.println(s1);
        System.out.println(s2);

        s1.addRating(1.0);
        s2.addRating(10.0);

        System.out.println("\n"+s1);
        System.out.println(s2);

        s1.removeRating(1.0);
        s2.removeRating(8.0);

        System.out.println("\n"+s1);
        System.out.println(s2);

        System.out.println("\n"+s1.equals(s2));
        System.out.println(s2.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
