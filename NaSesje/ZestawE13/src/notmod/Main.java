package notmod;

public class Main {
    public static void main(String[] args) {
        InmutablePoint inmutablePoint = new InmutablePoint(4, 1, 5);

        System.out.println(inmutablePoint);
        System.out.println(inmutablePoint.getX());
        System.out.println(inmutablePoint.getY());
        System.out.println(inmutablePoint.getZ());
    }
}
