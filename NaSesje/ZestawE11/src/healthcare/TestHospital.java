package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Hospital 1", 250.0);
        Hospital h2 = new Hospital("Hospital 2", 500.0);
        Hospital h3 = new Hospital("Hospital 3", 100.0);

        Clinic c1 = new Clinic("Clinic 1", 300.0, 7.8);
        Clinic c2 = new Clinic("Clinic 2", 600.0, 9.6);

        System.out.println(h1);
        System.out.println(c1);

        System.out.println("\n");
        System.out.println(h1.getCapacity());
        System.out.println(h1.getName());

        h1.setCapacity(1000.0);
        System.out.println("\n");
        System.out.println(h1);

        System.out.println("\n");
        System.out.println(h1.equals(h1));
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c2));
    }
}
