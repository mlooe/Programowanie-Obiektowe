package zad3;

import java.util.List;

public class Counter <T> {
    private List<T> elements;
    private int count = 0;

    public Counter(List<T> elements) {
        this.elements = elements;
    }

    public void add(T element){
        elements.add(element);
        setCount(this.count+1);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
