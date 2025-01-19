package visitor20.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import visitor20.FlightStatus;
import visitor20.visitor.IFlightVisitor;

// Flight class representing a flight with attributes like flight number, capacity, passengers, and status
@AllArgsConstructor
@Getter
@ToString
public class Flight implements IFlight {
    private final String flightNumber;
    private final int capacity;
    private final int passengers;
    private final FlightStatus status;

    // Calculates the load factor, which is the percentage of seats occupied
    public double getLoadFactor() {
        return (double) passengers / capacity;
    }

    // Accept method allows a visitor to visit this flight object
    // This enables operations to be performed on the object without modifying its structure
    @Override
    public int accept(IFlightVisitor visitor) {
        return visitor.visit(this);
    }
}