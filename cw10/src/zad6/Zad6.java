package zad6;

public class Zad6 {
    public static <T> void swap(T[] array, int index1, int index2){
        if(index1 > array.length || index2 > array.length){
            System.out.println("Niepoprawny indeks");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
    

}
