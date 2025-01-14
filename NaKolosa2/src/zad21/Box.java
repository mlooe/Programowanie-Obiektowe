package zad21;

public class Box <T>{
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<String>("Hello");

        System.out.println(box.getValue());
    }
}
