package lsp.ex1.with;

public class HealthPotion extends Item implements Usable {

    public HealthPotion(int id, int price, String name) {
        super(id, price, name);
    }

    @Override
    void getDescription() {
        //some logic here
    }

    @Override
    public void use() {
        //some logic here
    }
}
