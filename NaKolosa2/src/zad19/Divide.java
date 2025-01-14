package zad19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        dzielenie();
    }

    public static void dzielenie() {
        try {
            int liczba1,liczba2;

            try {
                Scanner s1 = new Scanner(System.in);
                Scanner s2 = new Scanner(System.in);

                System.out.println("Podaj pierwszą liczbę: ");
                liczba1 = s1.nextInt();

                System.out.println("Podaj drugą liczbę: ");
                liczba2 = s2.nextInt();




            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono coś innego niż liczbę! Spróbuj ponownie.");
                dzielenie();
                return;
            }
            if(liczba2 == 0){
                throw new ArithmeticException("Nie można dzielić przez zero!!!");
            }
            System.out.println("Wynik dzielenia: " + liczba1*1.0/liczba2);

        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            dzielenie();
        }
    }
}
