import java.util.ArrayList;

public class Butterfly extends Animal{
    public Butterfly(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Bonifacy"));
        animals.add(new Dog("Reksio"));
        animals.add(new Butterfly("Paź"));


        for(Animal animal : animals){
            if(animal instanceof LoudAnimal loudAnimal){
                loudAnimal.makeSound();
                loudAnimal.sayName();
            }
        }
    }

}
