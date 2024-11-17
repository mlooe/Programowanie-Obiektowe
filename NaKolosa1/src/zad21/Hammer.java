package zad21;

public class Hammer extends Tool{
    public Hammer(String name) {
        super(name);
    }

    public void printAll(){
        System.out.println("Nazwa młotka: " + getName());
    }
}
