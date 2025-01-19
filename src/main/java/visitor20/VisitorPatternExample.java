package visitor20;

import lombok.extern.slf4j.Slf4j;
import visitor20.flight.Flight;
import visitor20.flight.IFlight;

import java.util.List;

@Slf4j
public class VisitorPatternExample {
    public static void main(String[] args) {
        List<IFlight> flights = List.of(
            new Flight("LH123", 180, 150, FlightStatus.ON_TIME),
            new Flight("BA456", 200, 180, FlightStatus.DELAYED),
            new Flight("AF789", 220, 200, FlightStatus.ON_TIME)
        );

        FlightStatisticsTracker tracker = new FlightStatisticsTracker(flights);
        tracker.trackStatistics();
    }
}