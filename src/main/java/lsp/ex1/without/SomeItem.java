package lsp.ex1.without;

public class SomeItem extends Item {

    public SomeItem(int id, int price, String name) {
        super(id, price, name);
    }

    @Override
    void getDescription() {
        //some logic here
    }

    @Override
    void use() {
        throw new UnsupportedOperationException("Using this item is not supported, you can only have it");
    }
}
