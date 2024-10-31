package zad1;

public class Employee extends Person{
    public int salary;
    public Employee(String firstName, String lastName, int salary){
        super(firstName, lastName);
        this.salary = salary;
    }


    @Override
    public void przedstawSie() {
        // super.przedstawSie();
        System.out.println("Nazywam się " + getFirstName() + " " + getLastName() +
        " Zarabiam " + salary + " brutto");
    }
}
