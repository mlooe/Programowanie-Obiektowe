package zad3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int countZeros(ArrayList<Integer> list){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] tab = {0,1,2,0,3,0,4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(tab));
        System.out.println(countZeros(list));
    }

}
