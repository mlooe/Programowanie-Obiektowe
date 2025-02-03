package utilities;

public class algorithm {
    public <T extends Comparable<T>> T findMin(T x, T y, T z){
        T temp = x;
        if(y.compareTo(x) < 0)
            temp = y;
        if(z.compareTo(x) < 0){
            temp = z;
        }
        return temp;
    }
}
