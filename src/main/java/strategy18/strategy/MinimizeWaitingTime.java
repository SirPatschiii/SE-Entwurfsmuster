package strategy18.strategy;

import strategy18.flight.Flight;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Strategy to minimize waiting time for flights.
 *
 * This strategy sorts the list of flights in ascending order based on waiting time,
 * prioritizing flights with shorter waiting times.
 */
public class MinimizeWaitingTime extends Strategy {
    @Override
    public List<Flight> execute(List<Flight> flights) {
        return flights.stream()
                .sorted(Comparator.comparingInt(Flight::getWaitingTime))
                .collect(Collectors.toList());
    }
}
