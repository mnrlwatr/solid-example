package lsp.HistoryConstraint;

public class SomeCar extends Car {

    public SomeCar(int mileage) {
        super(mileage);
    }

    /*
    The SomeCar has an extra method reset that resets the mileage property.
    In doing so, the SomeCar ignored the constraint imposed by its parent on the mileage property.
    */
    public void reset() {
        mileage = 0;
    }
    /*
    The SomeCar has an extra method decrementMileage that decrements the mileage property.
    In doing so, the SomeCar ignored the constraint imposed by its parent on the mileage property.
    */
    public void decrementMileage() {
        mileage--;
    }
    /*
    The SomeCar has an extra method setMileage that sets the mileage property.
    In doing so, the SomeCar ignored the constraint imposed by its parent on the mileage property.
    */
    public void setMileage(int value){
        mileage=value;
    }

    /*
    This breaks any client code that relies on the constraint.
    So, SomeCar isn’t substitutable for Car.
    Similarly, if the base class has an immutable property, the subclass should not permit this property to be modified.
    This is why immutable classes should be final.
    */

}
