public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 3);
        Person p3 = new Person("Adam", 3);
        Person p2 = new Person("Stefan");
        System.out.println(p1.equals(p3));
        p1.przedstawSie();
    }
}