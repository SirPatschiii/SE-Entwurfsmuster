/**
 * The Flight class represents a flight that can transition between different states.
 */
package state17.Flight;

import state17.state.FlightState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flight {
    private String flightNumber;
    private FlightState state;

    public Flight(String flightNumber, FlightState state) {
        this.flightNumber = flightNumber;
        this.state = state;
    }

    /**
     * Updates the flight state if the transition is valid.
     */
    public void updateState(FlightState newState) {
        if (state.canTransitionTo(newState)) {
            System.out.println("Transitioning flight " + flightNumber + " from " + state.getDescription() + " to " + newState.getDescription());
            state = newState;
            state.handleStateChange(this);
        } else {
            System.out.println("Invalid transition from " + state.getDescription() + " to " + newState.getDescription() + " for flight " + flightNumber);
        }
    }
}
