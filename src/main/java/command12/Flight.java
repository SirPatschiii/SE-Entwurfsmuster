package command12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flight {
    private String flightId;      // Unique ID of the flight
    private String destination;   // Current destination of the flight
    private String stopover;      // Current stopover, if any

    // Method to move the flight to a new destination
    public void moveFlight(String newDestination) {
        System.out.println("Flight " + flightId + " moved to " + newDestination);
        this.destination = newDestination;
    }

    // Method to add a stopover to the flight
    public void addStopover(String stopover) {
        System.out.println("Stopover added: " + stopover + " for flight " + flightId);
        this.stopover = stopover;
    }

    // Method to remove a stopover from the flight
    public void removeStopover() {
        System.out.println("Stopover removed for flight " + flightId);
        this.stopover = null;
    }
}

