package zad1;

import zad1.Silnik;

public class SilnikDiesel implements Silnik {
    @Override
    public void uruchom() {
        System.out.println("Uruchomiono silnik diesel.");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymano silnik diesel.");
    }
}
