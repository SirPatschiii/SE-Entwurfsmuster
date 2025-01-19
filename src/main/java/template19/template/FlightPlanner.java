package template19.template;

import lombok.extern.slf4j.Slf4j;
import template19.enums.AircraftType;

import java.util.List;

@Slf4j
public abstract class FlightPlanner {
    /**
     * The template method defines the general process of flight planning.
     * It ensures that all necessary steps are executed in the correct order.
     * This method cannot be overridden by subclasses to maintain the process structure.
     */
    public final void planFlight(String origin, String destination, AircraftType type) {
        log.info("Starting flight planning from {} to {} with {}", origin, destination, type.getDescription());
        List<String> route = defineRoute(origin, destination); // Step 1: Define the route
        route = optimizeRoute(route); // Step 2: Optimize the route
        executeFlight(route, type); // Step 3: Execute the flight
    }

    /**
     * This method is implemented by subclasses to define a specific route.
     * Each flight planner can have its own logic for determining the route.
     */
    protected abstract List<String> defineRoute(String origin, String destination);

    /**
     * This method is implemented by subclasses to provide a specific strategy for route optimization.
     * Depending on the implementation, the route can be improved based on different factors.
     */
    protected abstract List<String> optimizeRoute(List<String> route);

    /**
     * This step remains unchanged and performs the actual flight execution.
     * It simulates the flight along the planned route with the selected aircraft type.
     */
    private void executeFlight(List<String> route, AircraftType type) {
        log.info("Executing flight with {} via route: {}", type.getDescription(), route);
    }
}
