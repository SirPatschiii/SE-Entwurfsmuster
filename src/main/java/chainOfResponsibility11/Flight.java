package chainOfResponsibility11;

import lombok.*;
import state17.state.*;

// Flight class
@Getter
@Setter
public class Flight {
    private String flightId;
    private String destination;
    private FlightState delayedState;
    private FlightState scheduledState;
    private FlightState landedState;
    private FlightState inTheAirState;
    private FlightState currentState;
    private FlightState weatherApprovedState;

    public Flight(String flightId, String destination) {
        this.flightId = flightId;
        this.destination = destination;
        this.delayedState = new DelayedState();
        this.scheduledState = new ScheduledState();
        this.landedState = new LandedState();
        this.inTheAirState = new InTheAirState();
        this.weatherApprovedState = new WeatherApprovedState();

        // initial state is planned
        this.currentState = scheduledState;
    }

    /**
     * Updates the flight state if the transition is valid.
     */
    public void updateState(FlightState newState) {
        if (currentState.canTransitionTo(newState)) {
            System.out.println("Transitioning flight from " + currentState.getDescription() + " to " + newState.getDescription());
            currentState = newState;
            currentState.handleStateChange(this);
        } else {
            System.out.println("Invalid transition from " + currentState.getDescription() + " to " + newState.getDescription());
        }
    }
}
