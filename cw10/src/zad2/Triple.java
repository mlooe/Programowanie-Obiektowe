package zad2;

public class Triple <T, U, V>{
    private T value1;
    private U value2;
    private V value3;

    public Triple(T value1, U value2, V value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getFirst() {
        return value1;
    }

    public U getSecond() {
        return value2;
    }

    public V getThird() {
        return value3;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public void setValue3(V value3) {
        this.value3 = value3;
    }


}
