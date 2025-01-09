package zad4;

public class Main {
    public static void main(String[] args) {
        String s1 = "napis";
        String s2 = "napis2";

        System.out.println(isEqual(s1, s2));


    }

    public static <T> boolean isEqual(T value, T value2){
        return value.equals(value2);
    }
}
