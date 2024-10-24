package zad3;

public class Product {
    public static int numberOfProducts;
    public static final int MAX_PRODUCTS = 100;

    public Product(){
        numberOfProducts++;
        if(numberOfProducts > MAX_PRODUCTS){
            System.out.println("Ilość punktów przekroczona");
            numberOfProducts = MAX_PRODUCTS;
        }
    }

}
