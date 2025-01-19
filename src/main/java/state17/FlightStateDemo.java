package state17;

import state17.Flight.Flight;
import state17.state.DelayedState;
import state17.state.InTheAirState;
import state17.state.LandedState;
import state17.state.ScheduledState;

/**
 * Demonstration of the State Pattern in action.
 */
public class FlightStateDemo {
    public static void main(String[] args) {
        // Create a flight with an initial state of Scheduled.
        Flight flight = new Flight("LH123", new ScheduledState());

        // Simulate state transitions
        System.out.println("Initial State: " + flight.getState().getDescription());
        flight.updateState(new DelayedState()); // Transition to Delayed
        flight.updateState(new InTheAirState()); // Transition to In the Air
        flight.updateState(new LandedState()); // Transition to Landed

        // Attempt an invalid state transition
        flight.updateState(new ScheduledState());
    }
}
