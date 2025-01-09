package Zad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę: ");
            Double a = Double.valueOf(s1.nextLine());

            System.out.println("Podaj drugą liczbę: ");
            Double b = Double.valueOf(s2.nextLine());

            System.out.println(Divide(5, 7));
        }
        catch (ArithmeticException a){
            System.out.println("Nie mozna dzielić przez zero");
        }

        catch (NumberFormatException n){
            System.out.println("Podana wartość powinna być liczbą                               !");
        }
    }
    public static double Divide(double liczba1, double liczba2){
        if(liczba2 == 0){
            throw new ArithmeticException("Nie mozna dzielic przez zero!");
        }
        return liczba1 / liczba2;
    }
}
