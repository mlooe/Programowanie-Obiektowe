package zad2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static double average(ArrayList<Double> list){
        double sum = 0;
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }


    public static void main(String[] args) {
        Double[] tab = {1.0, 2.5, 3.8, 4.5, 5.0};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(tab));
        System.out.println(average(list));
    }
}
