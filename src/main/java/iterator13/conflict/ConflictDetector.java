package iterator13.conflict;

import iterator13.shared.Flight;
import iterator13.shared.FlightCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// ConflictDetector class for identifying conflicts
public class ConflictDetector {
    public List<Conflict> detectConflicts(FlightCollection flightCollection) {
        List<Flight> flights = flightCollection.getFlights();

        // Using streams to find duplicate gate assignments
        List<Conflict> conflicts = flights.stream()
                .collect(Collectors.groupingBy(Flight::getGate))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1) // Filter gates with more than one flight
                .flatMap(entry -> {
                    List<Flight> conflictFlights = entry.getValue();
                    List<Conflict> gateConflicts = new ArrayList<>();
                    for (int i = 0; i < conflictFlights.size(); i++) {
                        for (int j = i + 1; j < conflictFlights.size(); j++) {
                            gateConflicts.add(new Conflict(conflictFlights.get(i), conflictFlights.get(j), ConflictType.DUPLICATE_GATE));
                        }
                    }
                    return gateConflicts.stream();
                })
                .collect(Collectors.toList());

        return conflicts;
    }
}
