package visitor20;

import lombok.extern.slf4j.Slf4j;
import visitor20.flight.IFlight;
import visitor20.visitor.AveragePassengerLoadVisitor;
import visitor20.visitor.OnTimeDepartureVisitor;

import java.util.List;

// Class for tracking flight statistics using visitors
@Slf4j
public class FlightStatisticsTracker {
    private final List<IFlight> flights;

    public FlightStatisticsTracker(List<IFlight> flights) {
        this.flights = flights;
    }

    // Calculates and logs all statistics for the given flight list
    public void trackStatistics() {
        AveragePassengerLoadVisitor passengerLoadVisitor = new AveragePassengerLoadVisitor();
        OnTimeDepartureVisitor onTimeVisitor = new OnTimeDepartureVisitor();

        for (IFlight flight : flights) {
            flight.accept(passengerLoadVisitor);
            flight.accept(onTimeVisitor);
        }

        log.info("Average Passenger Load: {}", passengerLoadVisitor.getAveragePassengerLoad());
        log.info("Percentage of On-Time Flights: {}%", onTimeVisitor.getOnTimePercentage());
    }
}