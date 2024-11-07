package cw02;

public class Main {
    public static void main(String[] args) {
        Adress a1 = new Adress("aklsjdf", 23, 10101, "Olsztyn");
        Person p1 = new Person("Andjjerz", "Anikiewicz", a1);

        System.out.println(a1);
        System.out.println(p1);
    }
}
