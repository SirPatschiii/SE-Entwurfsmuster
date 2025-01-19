package memento15.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Memento class storing the state of the Originator
@Getter
@AllArgsConstructor
public class FlightPlanMemento {
    // Fields are immutable to encapsulate the saved state
    private final String flightNumber;
    private final String destination;
    private final String departureTime;
}
