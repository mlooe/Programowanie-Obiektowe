package zad10;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\n Person: " + firstName + " " + lastName + ", Birth date:  " + birthDate;
    }


    public static void main(String[] args) {
        Person[] people = {
                new Person("John", "Robertson", LocalDate.of(2004, 8, 8)),
                new Person("Robert", "Johnson", LocalDate.of(1990, 5, 5)),
                new Person("Leonardo", "Da Vinci", LocalDate.of(1452, 4, 15)),
                new Person("Alex", "Janes", LocalDate.of(2008, 11, 19)),
                new Person("Michael", "Theodor", LocalDate.of(2018, 3, 20)),
        };
        System.out.println("---------------Przed sortowaniem: ---------------");
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, new LastNameComparator());
        System.out.println("---------------Sortowanie po nazwisku: ---------------");
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, new BirthDateComparator());
        System.out.println("---------------Sortowanie po dacie urodzenia: ---------------");
        System.out.println(Arrays.toString(people));
    }



}




class LastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}


class BirthDateComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}



