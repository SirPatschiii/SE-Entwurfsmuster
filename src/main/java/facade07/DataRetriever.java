package facade07;

import java.util.HashMap;
import java.util.Map;

// Subsystem
// User does not need to interact directly with the DateRetriever
public class DataRetriever {
    private final Map<String, ERouteStatus> routeStatuses = new HashMap<>();

    public void updateRouteStatus(String route, ERouteStatus status) {
        routeStatuses.put(route, status);
    }

    public ERouteStatus getRouteStatus(String route) {
        return routeStatuses.getOrDefault(route, ERouteStatus.ON_TIME);
    }
}
