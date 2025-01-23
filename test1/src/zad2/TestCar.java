package zad2;

import java.util.ArrayList;



public class TestCar {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("a1", 50, 2020));
        cars.add(new Car("a2", 100, 2017));
        cars.add(new Car("a3", 3000, 2016));
        cars.add(new Car("a4", 25, 2025));
        cars.add(new Car("a5", 15000, 2000));
        cars.add(new Car("a6", 2500, 2010));


        System.out.println("Przed sortowaniem: ");
        System.out.println(cars);
        cars.sort(new MyComparator());
        System.out.println("\n\nPo sortowaniu:");
        System.out.println(cars);
    }
}
