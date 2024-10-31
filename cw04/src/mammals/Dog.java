package mammals;

import animals.Animal;

public class Dog extends Animal {
    public Dog(String species, int age) {
        super(species, age);
    }

    public void printAll(){
        System.out.println("Nazwa gatunku: " + getSpecies()  + ", Wiek: " + getAge());
    }
}
