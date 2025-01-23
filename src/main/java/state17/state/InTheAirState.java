package state17.state;

import chainOfResponsibility11.shared.Flight;

/**
 * The InTheAirState represents a flight that is currently in transit.
 * It can only transition to the Landed state.
 */
public class InTheAirState extends FlightState {
    public InTheAirState() {
        super("In the Air");
    }

    @Override
    public boolean canTransitionTo(FlightState newState) {
        return newState instanceof LandedState;
    }

    @Override
    public void handleStateChange(Flight flight) {
        System.out.println("Flight is now in the air.");
    }
}
