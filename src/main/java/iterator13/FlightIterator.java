package iterator13;

import java.util.Iterator;
import java.util.List;

// FlightIterator class for iterating over flights
public class FlightIterator implements Iterator<Flight> {
    private List<Flight> flights;
    private int position = 0;

    public FlightIterator(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public boolean hasNext() {
        return position < flights.size();
    }

    @Override
    public Flight next() {
        return flights.get(position++);
    }
}
