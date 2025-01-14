package zad24;

public class zad24{
    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static void main(String[] args) {
        Integer s1 = 5;
        Integer s2 = 13;

        Integer s3 = 14;
        Integer s4 = 14;

        System.out.println(isEqual(s1, s2));
        System.out.println(isEqual(s3, s4));
    }
}


