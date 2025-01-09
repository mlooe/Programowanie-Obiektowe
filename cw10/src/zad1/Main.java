package zad1;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test("asdf");

        Box<Test> b1 = new Box<>(t1);
        System.out.println(b1.getValue());
    }
}
