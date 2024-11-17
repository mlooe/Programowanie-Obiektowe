package zad18;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("AUDI", "A6", 3000);
        Vehicle v2 = new Vehicle(null, null, 2013);

        System.out.println(v1.toString());
        System.out.println(v2.toString());


    }
}
