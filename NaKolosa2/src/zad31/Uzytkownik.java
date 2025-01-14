package zad31;

public class Uzytkownik {
    private Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public Powiadomienie getPowiadomienie() {
        return powiadomienie;
    }

    public void setPowiadomienie(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja){
        powiadomienie.wyslij(informacja);
    }


}
