package zad5;

public class Main {
    public static boolean CompareLastAndFirst(String a){
        char first = a.charAt(0);
        char last = a.charAt(a.length()-1);

        return first == last;
    }

    public static void main(String[] args) {
        String a = "kajak";
        System.out.println(CompareLastAndFirst(a));
    }

}
