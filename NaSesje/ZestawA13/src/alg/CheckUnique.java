package alg;

import java.util.TreeSet;

public class CheckUnique {
    public static <E> boolean isUnique(TreeSet<E> elements){
        if(elements == null){
            throw new IllegalArgumentException("Przekazany argument nie mnoże być nullem!");
        }
        return true;
    }
}
