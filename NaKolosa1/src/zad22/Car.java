package zad22;

public class Car extends Vehicle {
    public int age;

    public Car(int age) {
        this.age = age;
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("The car is moving, and it is: " + age + " years old.");
    }
}
