package checking;

import java.util.HashSet;

public class CheckHash {
    public <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2){
        if(set1 == null || set2 == null){
            throw new IllegalArgumentException("Przekazany zbiór nie może być pusty");
        }

        return !set1.equals(set2);
    }
}
