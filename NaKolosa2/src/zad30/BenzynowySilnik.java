package zad30;

public class BenzynowySilnik implements Silnik {

    @Override
    public void uruchom() {
        System.out.println("Uruchomiono silnik na benzyne");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymano silnik");
    }
}
