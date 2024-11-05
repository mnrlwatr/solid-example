package lsp.ClassInvariants;

/*
The Car class specifies a class invariant that speed must always be below the limit.
The invariants rule states that all subtype methods (inherited and new) must maintain or strengthen the supertype’s class invariants.
Let’s define a subclass of Car that preserves the class invariant:
*/
public class HybridCar extends Car {
    // invariant: charge >= 0;
    private int charge;

    @Override
    // postcondition: speed < limit
    protected void accelerate() {
        // Accelerate HybridCar ensuring speed < limit
    }
}

/*
In this example, the invariant in Car is preserved by the overridden accelerate method in HybridCar.
The HybridCar additionally defines its own class invariant charge >= 0, and this is perfectly fine.
Conversely, if the class invariant is not preserved by the subtype, it breaks any client code that relies on the supertype.
*/