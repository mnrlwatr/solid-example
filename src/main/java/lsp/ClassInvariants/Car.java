package lsp.ClassInvariants;

 /*
 A class invariant is an assertion concerning object properties that must be true  for all valid states of the object.
 Let’s look at an example:
 */

public abstract class Car {
    protected int limit;

    // invariant: speed < limit;
    protected int speed;

    // postcondition: speed < limit
    protected abstract void accelerate();

    // Other methods...
}
