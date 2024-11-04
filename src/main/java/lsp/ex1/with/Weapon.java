package lsp.ex1.with;

public class Weapon extends Item implements Usable {

    public Weapon(int id, int price, String name) {
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
