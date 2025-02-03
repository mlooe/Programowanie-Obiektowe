package utilities;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(1);
        tab1.add(2);
        tab1.add(3);

        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(4);
        tab2.add(5);
        tab2.add(6);

        System.out.println(tab1);
        System.out.println(tab2);

        zad3.appendFromEnd(tab1, tab2);
        System.out.println("Po dodaniu: ");
        System.out.println(tab1);
    }
}
