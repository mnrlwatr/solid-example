package lsp.ex1.with;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usable> usables = new ArrayList<>();
        usables.add(new Weapon(1,1,"Weapon"));
        usables.add(new HealthPotion(1,1,"HealthPotion"));

        for (Usable usable : usables) {
            usable.use();
        }
    }
}
