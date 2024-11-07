package cw1;

public record Book(String title, String author, int price, int yearOfPublication){
    public void printALl(){
        System.out.println("Tytuł: " + title() + ", Autor: "+ author() + ", Cena: " + price()
        + ", Rok wydania: " + yearOfPublication());
    }
}
