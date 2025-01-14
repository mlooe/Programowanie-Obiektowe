package zad30;

public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start(){
        silnik.uruchom();
    }

    public void stop(){
        silnik.zatrzymaj();
    }
}
