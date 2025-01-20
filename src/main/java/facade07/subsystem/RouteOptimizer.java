package facade07.subsystem;

import java.util.List;
import java.util.stream.Collectors;

// Subsystem
// User does not need to interact directly with the RouteOptimizer
public class RouteOptimizer {
    public List<String> optimizeRoutes(List<String> routes) {
        // Example logic: sort routes by their natural alphabetical order
        return routes.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
