package lsp.Postconditions;
/*
Here, the brake method of Car specifies a postcondition that the Car‘s speed must reduce at the end of the method execution.  The subtype can strengthen (but not weaken) the postcondition for a method it overrides.
When a subtype strengthens the postcondition, it provides more than the supertype method.
Now, let’s define a derived class of Car that strengthens this precondition:
*/
public class HybridCar extends Car {
    // Some properties and other methods...

    @Override
    // postcondition: speed must reduce
    // postcondition: charge must increase
    protected void brake() {
        // Apply HybridCar brake
    }
}

/*
The overridden brake method in HybridCar strengthens the postcondition by additionally ensuring that the charge is increased as well.
Consequently, any client code relying on the postcondition of the brake method in the Car class notices no difference when it substitutes HybridCar for Car.
Conversely, if HybridCar were to weaken the postcondition of the overridden brake method, it would no longer guarantee that the speed would be reduced.
This might break client code given a HybridCar as a substitute for Car.
*/
