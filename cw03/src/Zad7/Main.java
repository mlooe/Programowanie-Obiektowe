package Zad7;

public class Main {
    public static void main(String[] args){
        Point p1 = new Point(1, 1);
        Point p2 = new Point(10, 5);
        distance(p1.x, p2.y);
    }

    static void distance(int a, int b) {
        while (b != 0) {
            int zmienna = b;
            b = a % b;
            a = zmienna;
        }
        System.out.println("Odległość między punktami: " + a);
    }


}

