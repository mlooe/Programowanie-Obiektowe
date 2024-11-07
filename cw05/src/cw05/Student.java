package cw05;

import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Double> tab){

    public double averageGrades(){
        double temp = 0;
        int ilosc = 0;
        for (double j : tab) {
            temp += j;
            ilosc++;
        }
        return temp/ilosc;
    }
}