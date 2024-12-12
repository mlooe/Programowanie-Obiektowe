package Zad4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Pracownik{
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia){
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }




    @Override
    public String toString() {
        return "Pensja = " + pensja;
    }

    public static void main(String[] args) {
        Pracownik[] pracownicy = {
                new Pracownik("A", 20.0, LocalDate.of(2019, 1,2)),
                new Pracownik("B", 10.0, LocalDate.of(2015, 1,2)),
                new Pracownik("C", 15.0,LocalDate.of(2013, 1,2)),
                new Pracownik("D", 5.0, LocalDate.of(2005, 1,2)),
        };

        System.out.println(Arrays.toString(pracownicy));
        Arrays.sort(pracownicy, new PensjaComparator());
        System.out.println(Arrays.toString(pracownicy));
    }

}

class PensjaComparator implements Comparator<Pracownik>{

    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return Double.compare(o1.pensja, o2.pensja);
    }
}