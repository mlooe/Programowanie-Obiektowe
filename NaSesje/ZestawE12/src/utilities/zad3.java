package utilities;

import java.util.ArrayList;

public class zad3 {
    public static <E> void appendFromEnd(ArrayList<? super E> tab1, ArrayList<E> tab2) {
        for (int i = tab1.size() - 1; i >= 0; i--) {
            tab1.add(tab2.get(i));
        }
    }
}
