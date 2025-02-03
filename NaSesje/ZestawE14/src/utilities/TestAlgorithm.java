package utilities;

public class TestAlgorithm {
    public static void main(String[] args) {
        Person[] tab = {
                new Person("Person 1", 17),
                new Person("Person 2", 18),
                new Person("Person 3", 19),
                new Person("Person 4", 20),
                new Person("Person 5", 21),
        };

        System.out.println(algorithm.countLessThanOrEqual(tab, new Person("Person 6", 19)));
    }
}
