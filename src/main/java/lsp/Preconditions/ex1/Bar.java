package lsp.Preconditions.ex1;
/*
Here, the precondition for the doStuff method states that the num parameter value must be between 1 and 5.
We have enforced this precondition with a range check inside the method. A subtype can weaken (but not strengthen) the precondition for a method it overrides.
When a subtype weakens the precondition, it relaxes the constraints imposed by the supertype method.
Let’s now override the doStuff method with a weakened precondition:
*/
public class Bar extends Foo {
    @Override
    // precondition: 0 < num <= 10
    public void doStuff(int num) {
        if (num <= 0 || num > 10) {
            throw new IllegalArgumentException("Input out of range 1-10");
        }
        // some logic here...
    }
}
/*
Here, the precondition is weakened in the overridden doStuff method to 0 < num <= 10, allowing a wider range of values for num.
All values of num that are valid for Foo.doStuff are valid for Bar.doStuff as well. Consequently, a client of Foo.doStuff doesn’t notice a difference when it replaces Foo with Bar.
Conversely, when a subtype strengthens the precondition (e.g. 0 < num <= 3 in our example), it applies more stringent restrictions than the supertype.
For example, values 4 & 5 for num are valid for Foo.doStuff, but are no longer valid for Bar.doStuff.
This would break the client code that does not expect this new tighter constraint.
*/
