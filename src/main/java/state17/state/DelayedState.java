package state17.state;

import chainOfResponsibility11.shared.Flight;

/**
 * The DelayedState represents a flight that has been postponed due to unforeseen circumstances.
 * It can transition back to Scheduled (if rescheduled) or proceed to InTheAir.
 */
public class DelayedState extends FlightState {
    public DelayedState() {
        super("Delayed");
    }

    @Override
    public boolean canTransitionTo(FlightState newState) {
        return newState instanceof ScheduledState || newState instanceof WeatherApprovedState;
    }

    @Override
    public void handleStateChange(Flight flight) {
        System.out.println("Flight is delayed. Gate remains available.");
    }
}
