package vehicle;

public class TestDescending {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 4, 3, 2, 1};
        Integer[] arr2 = {0, 1, 2, 3, 4};
        Integer[] arr3 = {};

        System.out.println(Descending.isDescending(arr1));
        System.out.println(Descending.isDescending(arr2));
        System.out.println(Descending.isDescending(arr3));
    }
}
