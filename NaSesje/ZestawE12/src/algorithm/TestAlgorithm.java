package algorithm;

public class TestAlgorithm {
    public static void main(String[] args) {
        Student s1 = new Student("Student 1", 4);
        Student s2 = new Student("Student 2", 2);
        Student s3 = new Student("Student 3", 3);

        Student s4 = new Student("Student 4", 5);
        Student s5 = new Student("Student 4", 5);
        Student s6 = new Student("Student 4", 5);

        System.out.println(algorithm.compareThree(s1, s2, s3));

        System.out.println(algorithm.compareThree(s4, s5, s6));

        System.out.println(algorithm.compareThree(s2, s2, s2));
    }
}
