package consistency;

public class CheckNonNull {
    public static <T> boolean areBothNonNull(T arg1, T arg2) {
        return arg1 != null && arg2 != null;
    }
}
