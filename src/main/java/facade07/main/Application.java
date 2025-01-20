package facade07.main;

import facade07.facade.FlightPlannerFacade;
import facade07.subsystem.EAircraftType;
import facade07.subsystem.ERouteStatus;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FlightPlannerFacade planner = new FlightPlannerFacade();

        // Allocate resources
        planner.allocateAircraft("NYC-LAX", EAircraftType.BOEING_737);
        planner.allocateAircraft("LAX-SFO", EAircraftType.AIRBUS_A320);

        // Optimize routes
        List<String> routes = Arrays.asList("LAX-SFO", "NYC-LAX", "SFO-SEA");
        List<String> optimizedRoutes = planner.optimizeRoutes(routes);
        System.out.println("Optimized Routes: " + optimizedRoutes);

        // Update and retrieve real-time data
        planner.updateRouteStatus("NYC-LAX", ERouteStatus.DELAYED);
        System.out.println("Route NYC-LAX status: " + planner.getRouteStatus("NYC-LAX"));

        // View allocated resources
        System.out.println("Allocated Resources: " + planner.getAllocatedResources());
    }
}
