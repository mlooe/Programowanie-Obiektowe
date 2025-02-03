package moto;

public class Main {
    public static void main(String[] args) {
        Vehicle[] tab = {
                new Vehicle("Model 2", 300.0),
                new Vehicle("Model 1", 350.0),
                new Vehicle("Model 4", 250.0),
                new Vehicle("Model 3", 225.5)
        };

        System.out.println(maxValue(tab));

    }

    public static <T extends Comparable<T>> T maxValue(T[] tab){
        T max = tab[0];

        for(int i = 1; i < tab.length; i++){
            if(max.compareTo(tab[i]) < 0){
                max = tab[i];
            }
        }
        return max;
    }
}
