package zad5;

public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student();
        Person person = new Person();
        Person person2 = new Person();

        System.out.println(compareObjects(student, person));
        System.out.println(compareObjects(person, person2));
    }

    public static <T extends Person> boolean compareObjects(T object1, T object2){
        return object1.getClass().equals(object2.getClass());
    }
}
