package composite05;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class WaypointStreet extends Waypoint {
    private final String name;
    private final ArrayList<Waypoint> waypoints = new ArrayList<>();

    public WaypointStreet(String name) {
        super();
        this.name = name;
    }

    @Override
    public void add(Waypoint waypoint) {
        waypoints.addLast(waypoint);
    }

    @Override
    public void remove(Waypoint waypoint) {
        waypoints.remove(waypoint);
    }

    @Override
    public Waypoint getChild(int i) {
        return waypoints.get(i);
    }

    @Override
    public void clearSection() {
        log.info("Cleared all sections in WaypointStreet : {}", name);
        for (Waypoint waypoint : waypoints) {
            waypoint.clearSection();
        }
    }
}
