package memento15.flightplan;

import memento15.memento.FlightPlanMemento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Originator class representing the object whose state is saved and restored
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightPlan {
    private String flightNumber;
    private String destination;
    private String departureTime;

    // Create a memento to save the current state of the FlightPlan
    public FlightPlanMemento createMemento() {
        return new FlightPlanMemento(flightNumber, destination, departureTime);
    }

    // Restore the state of the FlightPlan from a given memento
    public void restoreFromMemento(FlightPlanMemento memento) {
        if (memento != null) {
            this.flightNumber = memento.getFlightNumber();
            this.destination = memento.getDestination();
            this.departureTime = memento.getDepartureTime();
        }
    }
}