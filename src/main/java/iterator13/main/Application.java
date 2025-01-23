package iterator13.main;

import iterator13.conflict.Conflict;
import iterator13.conflict.ConflictDetector;
import iterator13.iterator.FlightIterator;
import iterator13.shared.Flight;
import iterator13.shared.FlightCollection;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FlightCollection flightCollection = new FlightCollection();
        flightCollection.addFlight(new Flight("LH123", "A1", "Berlin"));
        flightCollection.addFlight(new Flight("LH124", "A1", "Munich"));
        flightCollection.addFlight(new Flight("LH125", "B2", "Hamburg"));
        flightCollection.addFlight(new Flight("LH126", "B3", "Frankfurt"));

        // Iterate over flights using the custom iterator
        FlightIterator iterator = flightCollection.iterator();
        System.out.println("Iterating over flights:");
        while (iterator.hasNext()) {
            Flight flight = iterator.next();
            System.out.println("Flight ID: " + flight.getFlightId() + ", Gate: " + flight.getGate() + ", Destination: " + flight.getDestination());
        }

        // Detect conflicts
        ConflictDetector conflictDetector = new ConflictDetector();
        List<Conflict> conflicts = conflictDetector.detectConflicts(flightCollection);

        System.out.println("\nConflicts detected:");
        for (Conflict conflict : conflicts) {
            System.out.println("Conflict Type: " + conflict.getType() + ", Flights: " + conflict.getFlight1().getFlightId() + " and " + conflict.getFlight2().getFlightId());
        }
    }
}
