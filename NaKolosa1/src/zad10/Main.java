package zad10;

public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Square s2 = new Square();


        System.out.println(s1.side + " <-- Ustawiamy side na 5");
        System.out.println(s2.side + " <-- Domyślna wartość ustawiona za pomocą domyslnego konstruktora");
    }
}
