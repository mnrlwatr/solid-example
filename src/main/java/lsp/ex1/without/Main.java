package lsp.ex1.without;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Weapon(1,1,"weapon"));
        items.add(new SomeItem(1,1,"SomeItem"));
        items.add(new HealthPotion(1,1,"HealthPotion"));
        for (Item item : items) {
            item.use(); // throws UnsupportedOperationException
        }
    }
}
