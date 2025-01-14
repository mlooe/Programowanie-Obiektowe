package zad26;

public class zad26 {
    public static <T> void swap(T[] arr, int i1, int i2) {
        try{
            T temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
        }catch(IndexOutOfBoundsException e){
            System.out.println("Indeks poza zakresami tablicy!!!");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 10, 15};

        System.out.println("Przed użyciem swap: ");
        for(Integer i : arr){
            System.out.print(i + "\n");
        }

        swap(arr, 0, 2);

        System.out.println("\nPo użyciu swap: ");
        for(Integer i : arr){
            System.out.print(i + "\n");
        }

        System.out.println("\nPróba zamiany indeksów [0] oraz [8]: ");

        swap(arr, 0, 8);
    }
}
