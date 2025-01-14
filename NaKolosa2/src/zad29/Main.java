package zad29;

public class Main {
    public static void main(String[] args) {
        Biuro biuro = new Biuro(new StandardowyPrinter());

        biuro.drukujDokument("ajkshdfkjdsafhhkjafsd");
        biuro.drukujDokument("ok działa :thumbs_up:");
    }
}
