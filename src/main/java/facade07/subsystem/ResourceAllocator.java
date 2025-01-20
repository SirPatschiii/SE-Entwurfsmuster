package facade07.subsystem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Subsystem
// User does not need to interact directly with the ResourceAllocator
public class ResourceAllocator {
    private final Map<String, EAircraftType> allocatedResources = new HashMap<>();

    public void allocateAircraft(String route, EAircraftType aircraftType) {
        allocatedResources.put(route, aircraftType);
        System.out.println("Allocated " + aircraftType.getName() + " to route: " + route);
    }

    public Map<String, EAircraftType> getAllocatedResources() {
        return Collections.unmodifiableMap(allocatedResources);
    }
}
