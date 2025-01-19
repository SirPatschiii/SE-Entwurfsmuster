package composite05;

import lombok.Getter;

import java.util.ArrayList;

/**
 * Represents a flight plan consisting of a list of waypoints.
 * <p>
 * This class acts as the client in the Composite design pattern, interacting with both
 * composite and leaf waypoints to build and manage a navigation structure.
 * </p>
 */
@Getter
@SuppressWarnings("unused")
public class FlightPlan {
    private final ArrayList<Waypoint> flightPlanWaypoints = new ArrayList<>();
    private final String departure;
    private final String destination;

    /**
     * Constructs a {@link FlightPlan} with the specified departure and destination.
     *
     * @param departure   the departure location
     * @param destination the destination location
     */
    public FlightPlan(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    /**
     * Adds a waypoint to the flight plan.
     *
     * @param waypoint the waypoint to add
     */
    public void addWaypoint(Waypoint waypoint) {
        flightPlanWaypoints.addLast(waypoint);
    }

    /**
     * Removes a waypoint from the flight plan.
     *
     * @param waypoint the waypoint to remove
     */
    public void removeWaypoint(Waypoint waypoint) {
        flightPlanWaypoints.remove(waypoint);
    }
}
