package store;

import zad3.Book;
import zad3.Clothing;


public class TestProduct {
    public static void main(String[] args) {
        Product[] products = {new Book(), new Clothing(), new Clothing(), new Clothing(), new Book()};

        for(Product p:products){
            System.out.println(p.getPrice());
        }
    }
}
