package zad4;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("Andrzej", "Andrzejowski", -3);
        Person p2 = new Person("Jakub", "Kowalski", -23);
        System.out.println(p1);
        System.out.println(p2);
        //System.out.println(p1.equals(p2));
        //System.out.println(p1.hashCode() + " " + p2.hashCode());
    }
}
