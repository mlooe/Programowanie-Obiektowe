package zad4;

public class Main {
    public static String ReverseString(String napis){
        String s = "";
        for(int i=napis.length()-1; i>=0; i--){
            s = s + napis.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        String napis = "matma";
        System.out.println(ReverseString(napis));
    }
}
