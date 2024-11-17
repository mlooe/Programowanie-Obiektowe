package zad7;

public class Main {
    public static void Pyramid(char a, int n) {
        for(int i = 1; i<= n; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.print(a + " ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Pyramid('*', 3);
    }



}
