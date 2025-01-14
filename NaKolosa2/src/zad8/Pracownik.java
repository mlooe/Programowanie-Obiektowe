package zad8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Pracownik{
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "Pensja pracownika: " + pensja;
    }


    public static void main(String[] args)
        {
        Pracownik[] pracownicy = {
                new Pracownik("P1", 5300, LocalDate.of(2023, 3, 19))
        , new Pracownik("P2", 6000, LocalDate.of(2019, 6, 12))
        , new Pracownik("P3", 5800, LocalDate.of(2020, 9, 9))
        , new Pracownik("P4", 5400, LocalDate.of(2017, 4, 21))
        };

        System.out.println(Arrays.toString(pracownicy));
        Arrays.sort(pracownicy, new PensjaComparator());
        System.out.println(Arrays.toString(pracownicy));

    }

}

class PensjaComparator implements Comparator<Pracownik> {

    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return Double.compare(o1.pensja, o2.pensja);
    }
}
