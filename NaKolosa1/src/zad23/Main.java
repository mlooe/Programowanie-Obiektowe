package zad23;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        ExtendedCalculator e1 = new ExtendedCalculator();

        System.out.println(c1.add(5,5));
        System.out.println(e1.add(5,5,5));
    }
}
