package zad4;

import java.util.LinkedList;

public class count {
    public static <E extends Comparable<E>> int countGreaterThan(LinkedList<E> list, E element) {
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(element) > 0 ){
                count++;
            }
        }
        return count;
    }
}
