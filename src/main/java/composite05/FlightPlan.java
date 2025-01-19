package composite05;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class FlightPlan {
    private final ArrayList<Waypoint> flightPlanWaypoints = new ArrayList<>();
    private final String departure;
    private final String destination;

    public FlightPlan(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public void addWaypoint(Waypoint waypoint) {
        flightPlanWaypoints.addLast(waypoint);
    }

    public void removeWaypoint(Waypoint waypoint) {
        flightPlanWaypoints.remove(waypoint);
    }
}
