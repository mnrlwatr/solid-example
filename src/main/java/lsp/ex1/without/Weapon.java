package lsp.ex1.without;

public class Weapon extends Item {

    public Weapon(int id, int price, String name) {
        super(id, price, name);
    }

    @Override
    void getDescription() {
        //some logic here
    }

    @Override
    void use() {
        //some logic here
    }
}