package checking;

public class TestAlgorithm {
    public static void main(String[] args) {
        System.out.println(algorithm.isEqualOrNull("a", "a"));
        System.out.println(algorithm.isEqualOrNull(10, 10));
        System.out.println(algorithm.isEqualOrNull(10, 0));
        System.out.println(algorithm.isEqualOrNull(null, null));
        System.out.println(algorithm.isEqualOrNull(5, null));
    }
}
