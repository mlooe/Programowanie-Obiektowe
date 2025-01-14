package zad6;

import java.util.ArrayList;
import java.util.Collections;

public class Order implements Comparable<Order>{
    String productName;
    int quantity;
    double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public int compareTo(Order o) {
        if(this.unitPrice == o.unitPrice){
            return Integer.compare(this.quantity, o.quantity);
        }
        return Double.compare(o.unitPrice, this.unitPrice);
    }

    @Override
    public String toString() {
        return productName + " " + quantity + " " + unitPrice;
    }

    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>();

        orders.add(new Order("P1", 20, 8.99));
        orders.add(new Order("P2", 20, 3.50));
        orders.add(new Order("P3", 20, 2.99));
        orders.add(new Order("P4", 30, 8.99));
        orders.add(new Order("P5", 20, 6.00));

        System.out.println(orders);
        Collections.sort(orders);
        System.out.println(orders);

    }
}
