package bridge04.planner;

import bridge04.aircraft.IAircraftFleet;

// Provides a specialized implementation for the abstraction
public class CargoFlightPlanner extends FlightPlanner {
    public CargoFlightPlanner(IAircraftFleet fleet) {
        super(fleet); // Passing the implementor to the abstraction
    }

    @Override
    public void planFlight(String route) {
        System.out.println("Planning a cargo flight for " + fleet.getAircraftType() + " along route: " + route);
        fleet.performFlightOperation();
    }
}
