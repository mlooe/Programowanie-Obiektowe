package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Andrzej", "1", 3.25);
        StudentRecord s2 = new StudentRecord("Tomasz", "2", 4.54);

        s1.printDetails();
        s2.printDetails();

        System.out.println(s1.isHonorStudent());
        System.out.println(s2.isHonorStudent());
    }
}
