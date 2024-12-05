package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();
        electronicDevices.add(new Smartphone("XIAOMI", "T10", 2020));
        electronicDevices.add(new Smartphone("XIAOMI", "A50", 2024));
        electronicDevices.add(new Television("Telewizja1", "OS100", 2010));
        electronicDevices.add(new Television("Polsat", "B10", 2000));
        electronicDevices.add(new Laptop("Lenovo", "Legion", 2021));

        for(ElectronicDevice ed:electronicDevices){
            ed.turnOff();
            ed.turnOn();
        }
    }
}
