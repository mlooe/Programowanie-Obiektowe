public class Cat extends Animal implements LoudAnimal{
    public Cat(String name){
        super(name);

    }

    @Override
    public void makeSound(){
        System.out.println("Miau miau");
    }

    @Override
    public void sayName() {
        LoudAnimal.super.sayName();
    }
}
