package state17.state;

import chainOfResponsibility11.Flight;

/**
 * The ScheduledState represents a flight that is planned but has not yet taken off.
 * It can transition to either Delayed or InTheAir states.
 */
public class ScheduledState extends FlightState {
    public ScheduledState() {
        super("Scheduled");
    }

    /**
     * Determines if a flight can transition to a new state.
     * Scheduled flights can only transition to Delayed or InTheAir states.
     */
    @Override
    public boolean canTransitionTo(FlightState newState) {
        return newState instanceof DelayedState || newState instanceof WeatherApprovedState;
    }

    /**
     * Handles state-specific logic when transitioning into the Scheduled state.
     */
    @Override
    public void handleStateChange(Flight flight) {
        System.out.println("Flight is now scheduled and waiting at the gate.");
    }
}
