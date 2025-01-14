package zad14;

public class CheckAge {

    public void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        System.out.println("Age is " + age);
    }

    public static void main(String[] args) {
        CheckAge c = new CheckAge();
        c.checkAge(18);
        c.checkAge(15);

    }
}
