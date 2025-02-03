package checking;

public class algorithm {
    public static <T> boolean isEqualOrNull(T a, T b) {
        if(a == null && b == null){
            return true;
        }

        if(a == null || b == null){
            return false;
        }

        return a.equals(b);
    }
}
