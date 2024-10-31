package animals;

public class Animal {
    protected String species;
    private int age;

    public Animal(String species, int age){
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge(){
        return age;
    }

}
