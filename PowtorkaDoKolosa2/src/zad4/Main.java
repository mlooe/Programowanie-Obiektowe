package zad4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericQueue<Integer> g1 = new GenericQueue<>();

        g1.enqueue(3);
        g1.enqueue(6);
        g1.enqueue(2);
        g1.enqueue(1);
        g1.enqueue(8);

        System.out.println(g1);

        System.out.println(g1.dequeue());

        System.out.println(g1);
    }
}
