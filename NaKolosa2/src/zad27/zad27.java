package zad27;

public class zad27{
    public static <T extends Comparable<T>> T maxValue(T[] arr){
        try{
            if(arr.length==0){
                throw new IndexOutOfBoundsException("Array is empty");
            }
            T max = arr[0];
            for(int i=1; i < arr.length; i++){
                if(max.compareTo(arr[i]) < 0){
                    max = arr[i];
                }
            }
            return max;
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {5, 10, 3, 15, 8, 6, 20, 1};
        System.out.println("Największa wartość: " + maxValue(arr));

        Double[] arr2 = {3.5, 5.5, 2.5, 10.5, 8.5, 1.5};
        System.out.println("Największa wartość: " + maxValue(arr2));

        String[] arr3 = {"e", "f", "d", "a", "c", "b"};
        System.out.println("Największa wartość: " + maxValue(arr3));

        Integer[] arr4 = {};
        System.out.println("Największa wartość: " + maxValue(arr4));
    }
}
