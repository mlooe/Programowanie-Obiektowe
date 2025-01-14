package zad25;

public class Pair <T, U>{
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<>("a", "b");
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        Pair<String, String> p2 = new Pair<>("c", "d");
        System.out.println(p2.getSecond());
        System.out.println(p2.getFirst());

        p2.setFirst("e");
        System.out.println(p2.getFirst());
    }
}
