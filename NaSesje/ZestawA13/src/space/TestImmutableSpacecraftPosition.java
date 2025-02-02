package space;

public class TestImmutableSpacecraftPosition {
    public static void main(String[] args) {
        ImmutableSpacecraftPosition i1 = new ImmutableSpacecraftPosition(2.0, 3.0, 1.0);

        System.out.println(i1);
        System.out.println(i1.move(2.0, -8.0, 5.0));
    }
}
