package memento15.memento;

import memento15.flightplan.FlightPlan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightPlanManager {
    private final List<FlightPlanMemento> mementoList = new ArrayList<>();

    // Save the current state of the FlightPlan into the memento list
    public void saveState(FlightPlan flightPlan) {
        mementoList.add(flightPlan.createMemento());
    }

    // Retrieve and remove the last saved state from the memento list
    public FlightPlanMemento getLastSavedState() {
        if (!mementoList.isEmpty()) {
            return mementoList.removeLast();
        }
        return null; // Return null if there are no saved states
    }

    // List all saved states for reference
    public List<String> listSavedStates() {
        return mementoList.stream()
                .map(m -> String.format("Flight: %s, Destination: %s, Time: %s",
                        m.getFlightNumber(), m.getDestination(), m.getDepartureTime()))
                .collect(Collectors.toList());
    }
}
