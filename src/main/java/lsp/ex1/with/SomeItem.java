package lsp.ex1.with;

public class SomeItem extends Item {

    public SomeItem(int id, int price, String name) {
        super(id, price, name);
    }

    @Override
    void getDescription() {
        //some logic here
    }

}
