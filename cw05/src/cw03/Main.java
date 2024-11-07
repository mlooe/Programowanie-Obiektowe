package cw03;

public class Main {
    public static void main(String[] args) {
        PointR pR1 = new PointR(1, 2);
        PointC pC1 = new PointC(3, 4);

        System.out.println(pC1.x + pC1.y);

        pC1.konwertujNaRekord();


        System.out.println(pC1.x + pC1.y);
        System.out.println(pR1.konwertujNaKlase(pC1.x, pC1.y));
    }
}
