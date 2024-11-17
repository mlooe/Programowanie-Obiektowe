package zad9;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        //firstName = firstName;                              // nie da się tak przypisać bo nie rozróżnia parametrów od zmiennych lokalnych,
        //lastName = lastName;                                // a "this." odnosi się do aktualnego obiektu w metodzie lub konstruktora

        this.firstName = firstName;
        this.lastName = lastName;
    }
}
