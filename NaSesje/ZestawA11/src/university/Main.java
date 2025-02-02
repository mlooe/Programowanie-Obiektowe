package university;

import java.util.ArrayList;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("S1", 5.0));
        students.add(new Student("S4", 4.0));
        students.add(new Student("S3", 3.5));
        students.add(new Student("S4", 4.0));
        students.add(new Student("S5", 5.0));
        students.add(new Student("S4", 4.0));

        System.out.println(students);

        System.out.println("\n" + countElements(students, new Student("S4", 4.0)));
    }

    public static <T> int countElements(Collection<T> items, T element){
        int count = 0;

        for(T item : items){
            if(item.equals(element)){
                count++;
            }
        }
        return count;
    }
}
