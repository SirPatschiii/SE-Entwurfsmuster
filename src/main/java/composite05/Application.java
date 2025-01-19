package composite05;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        FlightPlan flightPlan = new FlightPlan("EDDM", "EDDF");
        WaypointStreet waypointStreet1 = new WaypointStreet("SID");
        WaypointStreet waypointStreet2 = new WaypointStreet("Y101");
        WaypointStreet waypointStreet3 = new WaypointStreet("T161");
        WaypointStreet waypointStreet4 = new WaypointStreet("STAR");

        waypointStreet1.add(new WaypointIntersection("EDDM"));
        waypointStreet1.add(new WaypointIntersection("GIVMI"));
        waypointStreet2.add(new WaypointIntersection("GIVMI"));
        waypointStreet2.add(new WaypointIntersection("ERNAS"));
        waypointStreet3.add(new WaypointIntersection("ERNAS"));
        waypointStreet3.add(new WaypointIntersection("ASPAT"));
        waypointStreet4.add(new WaypointIntersection("ASPAT"));
        waypointStreet4.add(new WaypointIntersection("EDDF"));

        flightPlan.addWaypoint(waypointStreet1);
        flightPlan.addWaypoint(waypointStreet2);
        flightPlan.addWaypoint(waypointStreet3);
        flightPlan.addWaypoint(waypointStreet4);
    }
}
