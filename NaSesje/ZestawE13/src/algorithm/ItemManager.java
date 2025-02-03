package algorithm;

import java.util.ArrayList;

public class ItemManager<T> {
    private ArrayList<T> tab;

    public ItemManager() {
        tab = new ArrayList<>();
    }

    public void addItem(T item){
        tab.add(item);
    }

    public T getItem(int index){
        return tab.get(index);
    }

    public int getItemCount(){
        return tab.size();
    }
}
