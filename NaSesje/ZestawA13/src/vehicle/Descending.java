package vehicle;

public class Descending {
    public static <T extends Comparable<T>> boolean isDescending(T[] arr){
        if(arr.length == 0 || arr == null){
            throw new IllegalArgumentException("Lista nie może być pusta lub null");
        }

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i].compareTo(arr[i+1]) > 0){
                return true;
            }
        }
        return false;
    }
}
