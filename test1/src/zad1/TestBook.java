package zad1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("asdf", "bfcd", 500);
        Book b2 = new Book("thr", "dvdv", 200);


        System.out.println(b1.isLarge());
        System.out.println(b2.isLarge());

        Book b3 = new Book("zxcv", "aqwer", -5);
    }
}
