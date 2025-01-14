package zad28;

import java.util.Collection;

public class Main {
    public static <T extends Number> double sumElements(Collection<T> collection) {
        double sum = 0;
        for(T element : collection){
            sum += element.doubleValue();
        }
        return sum;
    }
}
