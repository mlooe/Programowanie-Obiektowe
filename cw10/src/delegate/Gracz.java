package delegate;

public class Gracz {
    Bron bron;

    public Gracz(Bron bron) {
        this.bron = bron;
    }

    public void zaatakuj(){
        bron.zaatakuj();
    }

    public void setBron(Bron bron) {
        this.bron = bron;
    }
}
