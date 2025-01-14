package zad30;

public class Main {
    public static void main(String[] args) {
        Samochod s1 = new Samochod(new BenzynowySilnik());

        s1.start();
        s1.stop();
    }
}
