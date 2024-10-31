package zad2;

public class Hammer extends Tool{
    public Hammer(String Nazwa){
        super(Nazwa);
    }

    public void printall(){
        System.out.println("Nazwa młotka: " + getNazwa());
    }
}
