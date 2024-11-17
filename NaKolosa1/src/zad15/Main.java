package zad15;

public class Main {
    public static void main(String[] args) {
        //Mathematics.PI += 3;             <-- nie da się dodać do naszego pola wartość, ponieważ dodaliśmy słowo "final",
        System.out.println(Mathematics.PI);              // które nie pozwala na zmianę tej wartości
    }
}
