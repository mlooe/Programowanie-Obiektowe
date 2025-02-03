package algorithm;

import java.util.Collection;

public class algorithm {
    public static <T> void clearIfContains(Collection<T> collection, T element){
        try{
            if(collection.contains(element)){
                collection.clear();
            }
        } catch(NullPointerException e){
            System.out.println("Kolekcja nie może być null!");
        }


    }
}
