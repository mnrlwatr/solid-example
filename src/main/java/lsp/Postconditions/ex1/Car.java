package lsp.Postconditions.ex1;
/*
A postcondition is a condition that should be met after a method is executed.
Let’s look at an example:
*/
public abstract class Car {
    protected int speed;

    // postcondition: speed must reduce
    protected abstract void brake();

    // Other methods...
}
