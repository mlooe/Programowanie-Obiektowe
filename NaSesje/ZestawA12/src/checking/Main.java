package checking;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        CheckHash check = new CheckHash();

        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();


        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(check.checkDisjoint(list1, list2));
        System.out.println(check.checkDisjoint(list1, list1));
    }
}
