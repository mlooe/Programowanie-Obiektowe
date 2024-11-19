package zad28;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int oddElementsSum(ArrayList<Integer> lista){
        int sum = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) % 2 == 1){
                sum += lista.get(i);
            }
        }
        return sum;
    }




    public static void main(String[] args) {
        Integer[] tab = {1,2,3,4,5,1};
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(tab));

        System.out.println(oddElementsSum(lista));
    }


}
