package delegate;

public class Main {
    public static void main(String[] args) {
        Gracz gracz1 = new Gracz(new Miecz());
        gracz1.zaatakuj();

        gracz1.setBron(new Jojo());
        gracz1.zaatakuj();
    }

}
