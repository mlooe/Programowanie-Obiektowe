package zad21;

public class Tool {
    public String name;

    //gdy ustawimy konstruktor klasy bazowej na "private" to nie będziemy mogli z niego korzystać, bo nie da się do niego odwołać
    protected Tool(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
