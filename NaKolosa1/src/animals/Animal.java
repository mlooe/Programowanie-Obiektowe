package animals;

public class Animal {
    protected String species;
    private final int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
