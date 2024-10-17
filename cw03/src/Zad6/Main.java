package Zad6;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car("AUDI", "a6");
        Car c2 = new Car("BMW", "i2", 2015);

        System.out.println(c1.productionYear);
        System.out.println(c2.productionYear);
    }
}
