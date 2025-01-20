package bridge04.planner;

import bridge04.aircraft.IAircraftFleet;

// Provides a specialized implementation for the abstraction
public class PassengerFlightPlanner extends FlightPlanner {
    public PassengerFlightPlanner(IAircraftFleet fleet) {
        super(fleet); // Passing the implementor to the abstraction
    }

    @Override
    public void planFlight(String route) {
        System.out.println("Planning a passenger flight for " + fleet.getAircraftType() + " along route: " + route);
        fleet.performFlightOperation();
    }
}
