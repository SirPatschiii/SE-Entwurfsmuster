package template19.flights;

import lombok.extern.slf4j.Slf4j;
import template19.template.FlightPlanner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class EuropeanFlightPlanner extends FlightPlanner {
    /**
     * This implementation defines a typical European flight route,
     * including some important transportation hubs in Europe.
     */
    @Override
    protected List<String> defineRoute(String origin, String destination) {
        log.info("Defining European route from {} to {}", origin, destination);
        return Arrays.asList(origin, "Paris", "Frankfurt", destination); // Fixed route for Europe
    }

    /**
     * This method optimizes the route by removing duplicate entries.
     * This ensures that unnecessary stops are avoided.
     */
    @Override
    protected List<String> optimizeRoute(List<String> route) {
        log.info("Optimizing European route: {}", route);
        return route.stream().distinct().collect(Collectors.toList());
    }
}
