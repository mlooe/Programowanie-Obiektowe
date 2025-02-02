package games;

public class TestGames {
    public static void main(String[] args) {
        ComputerGame cg1 = new ComputerGame("Computer Game 1", "Producer 1", new double[]{7.6, 5.4, 3.6, 8.0});
        ComputerGame cg2 = new ComputerGame("Computer Game 2", "Producer 2", new double[]{4.3, 2.2, 1.0, 3.5});

        cg1.addRating(6.9);
        cg2.addRating(10.0);

        System.out.println(cg1);
        System.out.println(cg2);

        System.out.println("\n");
        cg1.removeRating(0);
        cg2.removeRating(1);

        System.out.println(cg1);
        System.out.println(cg2);

        System.out.println("\n");
        System.out.println(cg1.equals(cg2));
        System.out.println(cg1.equals(cg1));

        System.out.println("\n");
        System.out.println(cg1.hashCode());
        System.out.println(cg2.hashCode());
    }
}
