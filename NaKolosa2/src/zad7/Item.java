package zad7;

import java.util.Arrays;
import java.util.Collections;

public class Item implements Comparable<Item> {
    String name;
    double weight;
    double price;

    public Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Waga: " + weight;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.weight);
    }

    public static void main(String[] args)
    {
        Item[] items = {
                new Item("I1", 10.0, 2.0), new Item("I2", 15.0, 5.0),
                new Item("I3", 5.0, 2.5), new Item("I4", 2.0, 5.0)
        };

        System.out.println(Arrays.toString(items));
        Arrays.sort(items);
        System.out.println(Arrays.toString(items));
    }
}
