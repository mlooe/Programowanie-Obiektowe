package zad4;

import java.util.Scanner;

public class NewExceptionTest {
    public static void main(String[] args) {
        try{
            System.out.println(getValidUserInput());
        } catch (InputTooShortException e){
            System.out.println(e.getMessage());
        }


    }

    public static String getValidUserInput() throws InputTooShortException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź ciąg o długości przynajmniej 4 znaków: ");

        if(sc.nextLine().length() < 4){
            throw new InputTooShortException("Ciąg znaków jest zbyt krótki!!!");
        }
        return "OK";
    }
}


