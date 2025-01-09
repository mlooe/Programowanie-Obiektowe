public class Dog extends Animal implements LoudAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Hau hau");
    }


}
