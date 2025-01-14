package zad31;

public class Email implements Powiadomienie{

    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Wysłano wiadomość o tresci: " + wiadomosc);
    }
}
