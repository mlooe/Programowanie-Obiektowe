package algorithm;

public class TestItemManager {
    public static void main(String[] args) {
        ItemManager<Integer> tab = new ItemManager<>();

        tab.addItem(1);
        tab.addItem(2);
        tab.addItem(3);
        tab.addItem(4);
        tab.addItem(5);

        System.out.println(tab.getItem(1));
        System.out.println(tab.getItem(2));
        System.out.println(tab.getItemCount());
    }
}
