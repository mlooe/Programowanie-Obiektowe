package zad2;

public class Main {
    public static int oddElementsSum(int[] tab){
        int temp = 0;

        for(int i = 0; i<=tab.length; i++){
            if(i % 2 != 0){
                temp += i;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        System.out.println(oddElementsSum(tab));
    }

}
