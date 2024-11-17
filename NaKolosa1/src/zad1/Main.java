package zad1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int minimumValue(ArrayList<Integer> list) {
        int min = list.getFirst();

        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Integer[] tab = {2, 5, 10, 15, 1, 20,25, 30, -5, 35};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(tab));
        System.out.println(minimumValue(list));
    }


}
