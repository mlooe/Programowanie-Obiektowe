package zad27;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static double minimumValue(ArrayList<Double> lista) {
        double min = lista.getFirst();

        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) < min){
                min = lista.get(i);
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Double[] tab = {1.0, 5.0, 3.5, 0.5, -0.2, 0.0, 10.5};
        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(tab));
        System.out.println(minimumValue(lista));
    }
}
