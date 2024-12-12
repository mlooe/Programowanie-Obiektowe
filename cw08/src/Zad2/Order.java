package Zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Order implements Comparable<Order>{
    String productionName;
    int quantity;
    double unitPrice;

    public Order(String productionName, int quantity, double unitPrice){
        this.productionName = productionName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return productionName + " " + quantity + " " + unitPrice;
    }

    @Override
    public int compareTo(Order o) {
        if(Double.compare(this.unitPrice, o.unitPrice) == 0){
            return Integer.compare(this.quantity, o.quantity);
        }

        return Double.compare(o.unitPrice, this.unitPrice);
    }


    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order("A", 5, 5));
        orders.add(new Order("B", 10, 11));
        orders.add(new Order("C", 15, 15));
        orders.add(new Order("D", 20, 21));
        orders.add(new Order("E", 9, 21));

        System.out.println(orders);
        Collections.sort(orders);
        System.out.println(orders);
    }
}
