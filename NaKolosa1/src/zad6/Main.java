package zad6;

public class Main {
    public static String ReplaceFirstAndLast(String napis){
        char first = napis.charAt(0);
        char last = napis.charAt(napis.length()-1);


        return last + napis.substring(1, napis.length()-1) + first;
    }

    public static void main(String[] args) {
        String napis = "banan";
        System.out.println(ReplaceFirstAndLast(napis));
    }
}
