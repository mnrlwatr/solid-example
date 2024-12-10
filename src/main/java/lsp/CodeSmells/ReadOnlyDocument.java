package lsp.CodeSmells;

public class ReadOnlyDocument extends Document {
    @Override
    void save() {
        // подкласс «обнуляет» работу базового метода.
        // A Subtype Provides No Implementation (do nothing) for a Behavior It Can’t Fulfill
        // or throws an exception for a Behavior It Can’t Fulfill (throw new UnsupportedOperationException)
        // or always Returns the Same Fixed Value (e.g. return 0;)
    }
}
