package Przyklad;

public class SklepMonopolowy {
    public static void main(String[] args) {



    }

    public static void sprzedajCos() throws IllegalArgumentException{
        checkAge(17);
    }
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Niepełnoletni klient!");
        }
    }
}
