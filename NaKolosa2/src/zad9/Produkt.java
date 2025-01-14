package zad9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Produkt {
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    public Produkt(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(LocalDate dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public String toString() {
        return "\n Nazwa produktu: " + nazwa + ", Cena produktu: " + cena + ", Data waznosci: " + dataWaznosci;
    }

    public static void main(String[] args) {
        Produkt[] produkty = {
                new Produkt("P1", 9.99, LocalDate.of(2015, 5, 7)),
                new Produkt("P2", 5.69, LocalDate.of(2006, 11, 20)),
                new Produkt("P3", 2.99, LocalDate.of(1998, 8, 16)),
                new Produkt("P4", 3.5, LocalDate.of(2018, 2, 19)),
                new Produkt("P5", 3.5, LocalDate.of(1998, 2, 19)),
        };

        System.out.println(Arrays.toString(produkty));
        Arrays.sort(produkty, new DataWaznosciComparator());
        System.out.println(Arrays.toString(produkty));

    }



}


class DataWaznosciComparator implements Comparator<Produkt> {

    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.getDataWaznosci().compareTo(o2.getDataWaznosci());
    }
}