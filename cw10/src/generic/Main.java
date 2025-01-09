package generic;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Animal animal2 = new Animal("Burek");

        Box<Animal, Animal> box1 = new Box<>(animal, animal2);

        System.out.println(box1.getValue());
        System.out.println(box1.getValue2());

        String napis = "Cześć!";
        Box<Animal, String> box2 = new Box<>(animal, napis);
        Box<String, Animal> box3 = new Box<>(napis, animal);

        // wypisz(napis);
        wypisz(animal);
        wypisz(animal2);
    }

    public static <T extends Animal> void wypisz(T value){
        System.out.println(value);
    }
}
