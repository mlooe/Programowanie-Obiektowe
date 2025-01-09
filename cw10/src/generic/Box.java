package generic;

public class Box <T, U>{
    private T value;
    private U value2;

    public Box(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }
}
