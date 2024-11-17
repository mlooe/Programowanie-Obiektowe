package zad14;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1){
        double wynik = (this.x - p1.x) * (this.x - p1.x ) + (this.y - p1.y) * (this.y - p1.y);
        return Math.sqrt(wynik);
    }
}
