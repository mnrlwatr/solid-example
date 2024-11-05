package lsp.HistoryConstraint;

/*
The history constraint states that
the subclass methods (inherited or new) shouldn’t allow state changes
that the base class didn’t allow.
Let’s look at an example:
*/

public abstract class Car {

    // Allowed to be set once at the time of creation.
    // Value can only increment thereafter.
    // Value cannot be reset.
    protected int mileage;

    public Car(int mileage) {
        this.mileage = mileage;
    }

    // Other properties and methods...

}
