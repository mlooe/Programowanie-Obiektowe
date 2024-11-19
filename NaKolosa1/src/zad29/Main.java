package zad29;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("asdf", "fghj");
        Car c1 = new Car("vbnv", "xcvx", 5);

        System.out.println("Brand: " + v1.brand + ", Model: " + v1.model);
        System.out.println("Brand: " + c1.brand + ", Model: " + c1.model + ", Number of doors: " + c1.numberOfDoors + ".");

    }
}
