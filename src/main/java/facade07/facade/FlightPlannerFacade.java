package facade07.facade;

import facade07.subsystem.*;

import java.util.List;
import java.util.Map;

// The Facade
// allows real-time data to be retrieved via a simplified interface
public class FlightPlannerFacade {
    // Reference to the individual subsystems
    private final ResourceAllocator resourceAllocator;
    private final RouteOptimizer routeOptimizer;
    private final DataRetriever dataRetriever;

    // Constructor initializes all subsystems and encapsulates their complexity within the façade
    public FlightPlannerFacade() {
        this.resourceAllocator = new ResourceAllocator();
        this.routeOptimizer = new RouteOptimizer();
        this.dataRetriever = new DataRetriever();
    }

    // Allocate resources through the facade
    public void allocateAircraft(String route, EAircraftType aircraftType) {
        resourceAllocator.allocateAircraft(route, aircraftType);
    }

    // Optimize routes through the facade
    public List<String> optimizeRoutes(List<String> routes) {
        return routeOptimizer.optimizeRoutes(routes);
    }

    // Update real-time data through the facade
    public void updateRouteStatus(String route, ERouteStatus status) {
        dataRetriever.updateRouteStatus(route, status);
    }

    // Retrieve real-time data through the facade
    public ERouteStatus getRouteStatus(String route) {
        return dataRetriever.getRouteStatus(route);
    }

    // View allocated resources
    public Map<String, EAircraftType> getAllocatedResources() {
        return resourceAllocator.getAllocatedResources();
    }
}
