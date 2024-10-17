package Zad4;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("123123");
        employee.id = "Stefan Stefański";
        System.out.println(employee.id);
    }


    public static void main(Employee employee) {
       System.out.println(employee.id);
    }
}
