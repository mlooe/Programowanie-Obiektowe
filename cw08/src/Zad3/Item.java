package Zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Item implements Comparable<Item>{
    String name;
    double weight;
    double price;

    public Item(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Weight = " + weight;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.weight);
    }

    public static void main(String[] args) {
        Item[] myItems = {
                new Item("A", 20.0, 10.0),
                new Item("B", 10.0, 10.0),
                new Item("C", 15.0, 10.0),
                new Item("D", 5.0, 10.0),
        };




        System.out.println(Arrays.toString(myItems));
        Arrays.sort(myItems);
        System.out.println(Arrays.toString(myItems));
    }
}
