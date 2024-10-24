package zad1;

import java.util.Objects;

public class Person {
    public String imie;
    public String nazwisko;
    public double ocena;
    public static String nazwaUczelni = "UWM";

    public Person(String imie, String nazwisko, double ocena){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ocena = ocena;
    }

    @Override                           // te 3 mozna wygenerować: prawy przycisk -> generate
    public String toString(){
        return "Nazywam się " + imie + " " + nazwisko + ", studiuje na " + nazwaUczelni;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.ocena, ocena) == 0 && Objects.equals(imie, person.imie) && Objects.equals(nazwisko, person.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, ocena);
    }

    public static void main(String[] args){
        Person p1 = new Person("Adam", "Kowalski", 3);
        Person p2 = new Person("Janina", "Kozłowska", 4);
        Person p3 = new Person("Janina", "Kozłowska", 5);
        System.out.println(p2.hashCode() + " " + p3.hashCode());
        System.out.println(p1.equals(p3));



        //System.out.println(p1.imie + " " + p1.nazwisko + " " + Person.nazwaUczelni);
        //Person.nazwaUczelni = "ART";
        //System.out.println(p1.przedstawSie());
        //System.out.println(p2.przedstawSie());
    }

}
