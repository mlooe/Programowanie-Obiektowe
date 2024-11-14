package zad6;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", "X13", 2025);
        Vehicle v2 = new Vehicle("BMW", "X13", 2024);
        System.out.println(v1.toString());
        System.out.println(v1.hashCode());
        System.out.println(v1.equals(v2));
    }
}
