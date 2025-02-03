package university;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Student 1", 5.0));
        students.add(new Student("Student 2", 2.0));

        students.add(new Student("Student 3", 3.0));
        students.add(new Student("Student 3", 3.0));
        students.add(new Student("Student 3", 3.0));

        students.add(new Student("Student 4", 4.5));

        Iterator<Student> items = students.iterator();

        System.out.println(countElements(items, new Student("Student 3", 3.0)));

    }

    public static <T> int countElements(Iterator<T> items, T element){  // nie ma w zadaniu static ale idk nie działa bez tego
        int count = 0;

        while (items.hasNext()) {
            if (element.equals(items.next())) {
                count++;
            }
        }
        return count;
    }
}
