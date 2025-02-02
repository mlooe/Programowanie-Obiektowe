package literature;

public class TestLiterature {
    public static void main(String[] args) {
        Novel n1 = new Novel("Novel 1", "Author 1", new double[]{3.0, 5.5, 7.0});
        Novel n2 = new Novel("Novel 2", "Author 2", new double[]{8.5, 9.5, 10.0});

        System.out.println(n1);
        System.out.println(n2);


        n1.addRating(9.0);
        n2.addRating(1.0);

        System.out.println("\n"+n1);
        System.out.println(n2);

        n1.removeRating(0);
        n2.removeRating(3);

        System.out.println("\n"+n1);
        System.out.println(n2);

        System.out.println(n1.equals(n2));
        System.out.println(n2.equals(n2));
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
    }
}
