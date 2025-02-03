package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete[] athletes = {
                new Athlete("Mike Tyson", "USA", new double[]{8, 9, 10, 1}),
                new Athlete("Robert Lewandowski", "Poland", new double[]{4, 8, 3, 5}),
                new Athlete("Michael Jordan", "USA", new double[]{6, 6, 5, 14}),
                new Athlete("Usain Bolt", "Jamaica", new double[]{8, 11, 3, 4}),
        };

        System.out.println("Przed sortowaniem: ");
        System.out.println(Arrays.toString(athletes));

        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));

        System.out.println("\n\nPo przesortowaniu: ");
        System.out.println(Arrays.toString(athletes));


    }
}
