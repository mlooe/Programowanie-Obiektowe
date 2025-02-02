package alg;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> tab = new TreeSet<>();

        tab.add(1);
        tab.add(2);

        tab.add(1);       // TreeSet posiada tylko unikalne elementy (próba dodania duplikatów jest ignorowana)

        System.out.println(tab.size());
        System.out.println(CheckUnique.isUnique(tab));
    }
}
