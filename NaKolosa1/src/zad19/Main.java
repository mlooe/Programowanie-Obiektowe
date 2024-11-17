package zad19;

public class Main {
    public static void main(String[] args) {
        double[] tab = new double[5];

        //---------
        Results r1 = new Results("Andrzej", "Kowalski", tab);
        r1.addResult(0, 2.5);
        r1.addResult(1, 3);
        r1.addResult(2, 5);
        r1.addResult(3, 3.5);
        r1.addResult(4, 4);

        System.out.println(r1.toString());

        //-------
        r1.setFirstName("Stefan");
        r1.addResult(0, 4.5);
        r1.addResult(1, 5);
        r1.addResult(2, 5);
        r1.addResult(3, 5);
        r1.addResult(4, 5);

        System.out.println(r1.toString());
    }
}
