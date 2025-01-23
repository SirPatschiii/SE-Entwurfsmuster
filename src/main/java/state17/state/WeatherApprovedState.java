package state17.state;

import chainOfResponsibility11.shared.Flight;

public class WeatherApprovedState extends FlightState{
    public WeatherApprovedState() {
        super("Weather is approved");
    }

    /**
     * Determines if a flight can transition to a new state.
     * Scheduled flights can only transition to Delayed or InTheAir states.
     */
    @Override
    public boolean canTransitionTo(FlightState newState) {
        return newState instanceof InTheAirState;
    }

    /**
     * Handles state-specific logic when transitioning into the Wheather approved state.
     */
    @Override
    public void handleStateChange(Flight flight) {
        System.out.println("Flight is now approved and waiting for airplane and crew checks");
    }
}
