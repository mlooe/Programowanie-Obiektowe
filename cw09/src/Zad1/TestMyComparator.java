package Zad1;



public class TestMyComparator implements MyComparator{

    @Override
    public int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        TestMyComparator comparator = new TestMyComparator();

        System.out.println(comparator.compare(5,1));
        System.out.println(comparator.compare(8,8));
        System.out.println(comparator.compare(0,3));
    }
}
