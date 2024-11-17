package zad17;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Andrzej", "Kowalski", 25);
        Person p2 = new Person("Stefan", null, -80);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
