package visitor20.visitor;

import lombok.extern.slf4j.Slf4j;
import visitor20.flight.Flight;

// Visitor for calculating the average passenger load of flights
// This visitor iterates through all flights and computes the overall average number of passengers.
@Slf4j
public class AveragePassengerLoadVisitor implements IFlightVisitor {
    private int totalPassengers = 0;
    private int count = 0;

    @Override
    public int visit(Flight flight) {
        totalPassengers += flight.getPassengers();
        count++;
        log.info("{}: Passenger Count = {}", flight, flight.getPassengers());
        return flight.getPassengers();
    }

    // Returns the computed average number of passengers across all visited flights
    public double getAveragePassengerLoad() {
        return count == 0 ? 0 : (double) totalPassengers / count;
    }
}