package university;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Student 2", 3.2, 2021),
                new Student("Student 1", 2.9, 2020),
                new Student("Student 3", 3.2, 2019),
                new Student("Student 4", 4.9, 2023),
        };

        System.out.println("Przed sortowaniem: ");
        for(Student s : students){
            System.out.println(s);
        }

        Arrays.sort(students);
        System.out.println("\n\nPo posortowaniu: ");
        for(Student s : students){
            System.out.println(s);
        }
    }
}
