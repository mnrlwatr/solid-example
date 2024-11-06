package lsp.Preconditions;
/*
A precondition should be satisfied before a method can be executed.
Let’s look at an example of a precondition concerning parameter values:
*/
public class Foo {
    // precondition: 0 < num <= 5
    public void doStuff(int num) {
        if (num <= 0 || num > 5) {
            throw new IllegalArgumentException("Input out of range 1-5");
        }
        // some logic here
    }
}
