package zad2;

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test("asdf");
        Test t2 = new Test("greg");
        Test t3 = new Test("tyyj");

        Triple<Test, Test, Test> b1 = new Triple<>(t1, t2, t3);

        System.out.println(b1.getFirst());
        System.out.println(b1.getSecond());
        System.out.println(b1.getThird());
    }
}
