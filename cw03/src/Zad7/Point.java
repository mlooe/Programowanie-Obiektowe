package Zad7;
import java.lang.Math;

public class Point {
    public double x;
    public double y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1){
        double wynik = (this.x - p1.x) * (this.x - p1.x) + (this.y - p1.y)*(this.y - p1.y);
        wynik = Math.sqrt(wynik);
        return wynik;
    }
}
