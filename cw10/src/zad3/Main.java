package zad3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        Counter<Integer> count1 = new Counter<>(lista);
        System.out.println(count1.getCount());

        count1.add(25);
        count1.add(30);

        System.out.println(count1.getCount());
    }
}
