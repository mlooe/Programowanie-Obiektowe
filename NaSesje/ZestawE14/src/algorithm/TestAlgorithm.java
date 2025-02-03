package algorithm;

import java.util.HashMap;

public class TestAlgorithm {
    public static void main(String[] args) {
        HashMap<Person, String> hm = new HashMap<>();

        Person p1 = new Person("Tomasz");
        Person p2 = new Person("Andrzej");
        Person p3 = new Person("Tomasz");   // ta sama nazwa co p1
        
        hm.put(p1, "Dane1");
        hm.put(p2, "Dane2");
        hm.put(p3, "Dane3");   // przy próbie dodania p3, mapa hash potraktuje go jako p1

        System.out.println("Liczba unikalnych kluczy: " + algorithm.countUniqueKeys(hm));
    }
}
