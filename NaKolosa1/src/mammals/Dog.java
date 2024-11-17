package mammals;

import animals.Animal;

public class Dog extends Animal {
    public Dog(String species, int age) {
        super(species, age);
    }

    public void printAll(){
        System.out.println("Species: " + species + ", " + "Age: " + getAge()); // nie można odnieść się do pola "age" ponieważ,
    }                                                                     // jest ustawiona na private więc nie da się do niej dostać.
}                                                                         // i aby to zrobić, trzeba utworzyć metodę get() (Getter)
