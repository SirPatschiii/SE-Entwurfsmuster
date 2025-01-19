package visitor20.flight;
// Flight interface implementing the Visitor pattern
// The Visitor pattern allows us to separate algorithms from the objects on which they operate.
// This makes it easier to add new operations without modifying the existing object structure.

import visitor20.visitor.IFlightVisitor;

public interface IFlight {
    int accept(IFlightVisitor visitor);
}
