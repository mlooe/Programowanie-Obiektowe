package zad12;

import java.util.Arrays;

public class Employee implements Cloneable {
    String name;
    double[] salary;

    public Employee(String name, double[] salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + ", Salary: " + Arrays.toString(getSalary());
    }

    @Override
    public Employee clone() {
        try {
            Employee clone = (Employee) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John Smith", new double[] {6000, 5000, 4000, 4500, 6500, 5500, 5700, 4700, 6969, 6200, 4900, 4000});
        Employee e2 = e1.clone();

        e1.salary[5] = 10000;

        System.out.println(e1);
        System.out.println(e2);
    }
}
