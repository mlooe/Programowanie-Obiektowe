package utilities;

public class TestAlgorithm {
    public static void main(String[] args) {
        algorithm algorithm = new algorithm();

        System.out.println(algorithm.findMin(4, 3, 1));
        System.out.println(algorithm.findMin(0, 1, 2));
        System.out.println(algorithm.findMin(5, 3, 10));
    }
}
