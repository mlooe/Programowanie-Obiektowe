package zad5;

public class Pair<T,U> {

    private T value1;
    private U value2;

    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst() {
        return value1;
    }

    public U getSecond(){
        return value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }
}
