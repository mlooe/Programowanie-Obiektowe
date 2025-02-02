package consistency;

public class Main {
    public static void main(String[] args) {
        System.out.println(CheckNonNull.areBothNonNull(1, null));
        System.out.println(CheckNonNull.areBothNonNull(1, 1));
        System.out.println(CheckNonNull.areBothNonNull("asdf", null));
    }
}
