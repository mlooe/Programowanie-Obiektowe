package zad16;

import java.util.Objects;

public class Product {
    public static int numberOfProducts;
    public static final int MAX_PRODUCTS = 100;

    public Product() {
        numberOfProducts++;
        if(numberOfProducts > MAX_PRODUCTS){
            System.out.println("Ilość produktów przekroczona!");
            numberOfProducts = MAX_PRODUCTS;
        }
    }

}
