package bridge04.planner;

import bridge04.aircraft.IAircraftFleet;
import lombok.AllArgsConstructor;

// Decoupling with abstraction: FlightPlanner
@AllArgsConstructor
public abstract class FlightPlanner {
    protected IAircraftFleet fleet; // The abstraction maintains a reference to the implementor

    public abstract void planFlight(String route);
}
