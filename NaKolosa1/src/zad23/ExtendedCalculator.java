package zad23;

public class ExtendedCalculator extends Calculator {
    int c;
//    public ExtendedCalculator(int a, int b, int c) {
//        super(a, b);
//        this.c = c;
//    }

    public int add(int a, int b, int c){
        return super.add(a, b) + c;
    }
}
