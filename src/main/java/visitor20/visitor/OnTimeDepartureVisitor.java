package visitor20.visitor;

import lombok.extern.slf4j.Slf4j;
import visitor20.FlightStatus;
import visitor20.flight.Flight;

// Visitor for calculating the percentage of on-time flights
// This visitor calculates how many flights departed on time compared to the total number of flights.
@Slf4j
public class OnTimeDepartureVisitor implements IFlightVisitor {
    private long onTimeCount = 0;
    private long totalCount = 0;

    @Override
    public int visit(Flight flight) {
        if (flight.getStatus() == FlightStatus.ON_TIME) {
            onTimeCount++;
        }
        totalCount++;
        log.info("{}: Status = {}", flight, flight.getStatus());
        return flight.getStatus() == FlightStatus.ON_TIME ? 1 : 0;
    }

    // Computes the percentage of flights that departed on time
    public double getOnTimePercentage() {
        return totalCount == 0 ? 0 : (double) onTimeCount / totalCount * 100;
    }
}