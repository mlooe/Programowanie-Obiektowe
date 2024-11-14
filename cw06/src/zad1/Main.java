package zad1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static double minimumValue(ArrayList<Double> lista){
        double min = lista.get(0);

        for(int i = 1; i<lista.size(); i++){
            if(lista.get(i) < min){
                min = lista.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Double tab[] = {5.25, -12.10, 10.0};
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(tab));
        System.out.println(minimumValue(list));
    }
}
