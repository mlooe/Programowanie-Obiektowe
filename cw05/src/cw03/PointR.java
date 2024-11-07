package cw03;

public record PointR(int x, int y){
    public PointC konwertujNaKlase(int x, int y){
        return new PointC(x, y);
    }
}
