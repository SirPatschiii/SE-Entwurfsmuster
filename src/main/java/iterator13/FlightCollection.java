package iterator13;

import java.util.ArrayList;
import java.util.List;

// FlightCollection class for managing flights
 public class FlightCollection {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public FlightIterator iterator() {
        return new FlightIterator(flights);
    }

    public List<Flight> getFlights() {
        return flights;
    }

}
