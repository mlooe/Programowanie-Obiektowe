package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("h1", 15.0);
        Hospital h2 = new Hospital(null, -20);
        Hospital h3 = new Hospital("h3", 1.4);

        Clinic c1 = new Clinic("c1", -10, 6.9);
        Clinic c2 = new Clinic(null, 60.0, 2.3);

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));

        System.out.println(c1.equals(h1));
        System.out.println(c1.equals(h2));
        System.out.println(c2.equals(h1));

        System.out.println(c1);

        System.out.println(c2);
    }
}
