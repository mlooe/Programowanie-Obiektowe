package zad13;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "X12", 2020);
        Car c2 = new Car("AUDI", "A6");

        System.out.println(c1.brand + " " + c1.model + " " + c1.productionYear);
        System.out.println(c2.brand + " " + c2.model + " " + c2.productionYear);
    }
}
