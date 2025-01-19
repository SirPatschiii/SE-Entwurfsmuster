package strategy18.strategy;

import strategy18.flight.Flight;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Strategy to maximize seat utilization of flights.
 *
 * This strategy sorts flights in descending order based on seat occupancy percentage,
 * prioritizing flights that are more fully booked.
 */
public class MaximizeCapacity extends Strategy {
    @Override
    public List<Flight> execute(List<Flight> flights) {
        return flights.stream()
                .sorted((f1, f2) -> Double.compare(
                        (double) f2.getBookedSeats() / f2.getCapacity(),
                        (double) f1.getBookedSeats() / f1.getCapacity()))
                .collect(Collectors.toList());
    }
}
