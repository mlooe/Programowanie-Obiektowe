package zad32;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("AUDI", null, 3000);
        Vehicle v2 = new Vehicle("", "", 2010);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
