package Zad5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Produkt{
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    public Produkt(String nazwa, double cena, LocalDate dataWaznosci){
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public static void main(String[] args) {
        
    }


}



class DataWaznosciComparator implements Comparator<Produkt> {

    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.getDataWaznosci().compareTo(o2.getDataWaznosci());
    }
}



