package zad15;

public class TestMyComparator implements MyComparator {
    @Override
    public int compare(int a, int b) {
        if(a < b){
            return -1;
        }
        if(a == b){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        MyComparator comparator = new TestMyComparator();

        System.out.println(comparator.compare(1, 2));
        System.out.println(comparator.compare(2, 2));
        System.out.println(comparator.compare(3, 0));
        System.out.println(comparator.compare(5, 8));
    }

}
