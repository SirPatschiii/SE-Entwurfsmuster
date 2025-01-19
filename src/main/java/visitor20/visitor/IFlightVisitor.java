package visitor20.visitor;

import visitor20.flight.Flight;

// Visitor interface that defines the visit method for flight objects
// The visitor pattern provides a way to add new behaviors to existing class hierarchies without modifying them.
// It allows defining external operations that can be applied to different object types.
public interface IFlightVisitor {
    int visit(Flight flight);
}
