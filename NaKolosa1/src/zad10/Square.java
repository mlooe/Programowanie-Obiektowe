package zad10;

public class Square {
    int side;

    public Square(int side) {            // konstruktor, który umożliwia ustawienie wartości tego pola
        this.side = side;
    }

    public Square() {                    // default constructor - ustawia nasze wartości domyślne za pomocą
        this(1);                    // odniesienia się do poprzedniego konstruktora dzięki "this(...)"
    }



}
