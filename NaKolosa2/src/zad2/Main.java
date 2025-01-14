package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();

        electronicDevices.add(new Smartphone("XIAOMI", "T10", 2020));
        electronicDevices.add(new Smartphone("XIAOMI", "A50", 2024));
        electronicDevices.add(new Television("Samsung", "asdf", 2000));
        electronicDevices.add(new Television("Samsung", "bgvf", 2001));
        electronicDevices.add(new Laptop("Lenovo", "hth", 2017));
        electronicDevices.add(new Laptop("Lenovo", "fdfs", 2012));

        for (ElectronicDevice ed : electronicDevices) {
            ed.turnOn();
            ed.turnOff();
        }
    }
}
