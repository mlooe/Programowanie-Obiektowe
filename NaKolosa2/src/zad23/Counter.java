package zad23;

import java.util.ArrayList;
import java.util.List;

public class Counter <T>{
    private List<T> list;
    private int count;

    public Counter(List<T> list){
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add(T element){
        list.add(element);
        setCount(count+1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Counter<Integer> counter = new Counter<>(list);
        System.out.println(counter.getCount());

        counter.add(25);
        counter.add(45);
        counter.add(65);

        System.out.println(counter.getCount());
    }
}
