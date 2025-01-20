package state17.state;

import chainOfResponsibility11.Flight;

/**
 * The LandedState represents a flight that has completed its journey and landed.
 * This is a terminal state, meaning no further transitions are allowed.
 */
public class LandedState extends FlightState { // added optional so it makes more sense
    public LandedState() {
        super("Landed");
    }

    @Override
    public boolean canTransitionTo(FlightState newState) {
        return false; // Landed is a terminal state -> no more transitions
    }

    @Override
    public void handleStateChange(Flight flight) {
        System.out.println("Flight has landed. Passengers can now disembark.");
    }
}