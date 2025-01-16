package zad1;

public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik){
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

    public static void main(String[] args) {
        Samochod s1 = new Samochod(new BenzynowySilnik());
        Samochod s2 = new Samochod(new SilnikDiesel());

        s1.start();
        s1.stop();

        s2.start();
        s2.stop();
    }
}
