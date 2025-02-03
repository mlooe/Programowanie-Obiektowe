package utilities;

public class algorithm {
    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] tab, T element){
        int count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i].compareTo(element) <= 0){
                count++;
            }
        }
        return count;
    }
}
