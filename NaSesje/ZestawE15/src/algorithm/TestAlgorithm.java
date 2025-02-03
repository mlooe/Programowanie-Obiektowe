package algorithm;

import java.util.ArrayList;
import java.util.Collection;

public class TestAlgorithm {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        collection.add(1);
        collection.add(69);
        collection.add(3);
        System.out.println(collection);

        algorithm.clearIfContains(collection, 69);
        System.out.println(collection);

        Collection<Integer> collection2 = null;
        algorithm.clearIfContains(collection2, 6);
    }
}
