package lsp.ex1.with;

public abstract class Item {
    int id;
    int price;
    String name;

    public Item(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    abstract void getDescription();

}
