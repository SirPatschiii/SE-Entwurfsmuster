package template19.flights;

import lombok.extern.slf4j.Slf4j;
import template19.template.FlightPlanner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class USFlightPlanner extends FlightPlanner {
    /**
     * This implementation defines a typical flight route within the USA,
     * including some major cities as waypoints.
     */
    @Override
    protected List<String> defineRoute(String origin, String destination) {
        log.info("Defining US route from {} to {}", origin, destination);
        return Arrays.asList(origin, "Chicago", "New York", destination); // Fixed route for the USA
    }

    /**
     * This method optimizes the route by avoiding New York.
     * This can be useful to bypass congestion or high airport fees.
     */
    @Override
    protected List<String> optimizeRoute(List<String> route) {
        log.info("Optimizing US route: {}", route);
        return route.stream().filter(city -> !city.equals("New York")).collect(Collectors.toList());
    }
}
