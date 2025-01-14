package zad29;

public class StandardowyPrinter implements Printer{

    @Override
    public void drukuj(String tekst) {
        System.out.println("Wydrukowano: " + tekst);
    }
}
