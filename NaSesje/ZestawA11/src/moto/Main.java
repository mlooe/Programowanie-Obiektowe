package moto;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("V1", 300.1),
                new Vehicle("V2", 250.6),
                new Vehicle("V3", 165.9),
                new Vehicle("V4", 391.2),
                new Vehicle("V5", 286.6),
        };


        System.out.println(Arrays.toString(vehicles));

        System.out.println("\n\nMax value: " + maxValue(vehicles));

        Arrays.sort(vehicles);
        System.out.println("\n\n" + Arrays.toString(vehicles));
    }

    public static <T extends Comparable<T>> T maxValue(T[] tab){
        if(tab == null || tab.length == 0 ){
            return null;
        }

        T max = tab[0];
        for(T i : tab){
            if(i.compareTo(max) > 0){
                max = i;
            }
        }
        return max;
    }
}
