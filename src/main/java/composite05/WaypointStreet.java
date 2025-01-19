package composite05;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Represents a street in the waypoint structure.
 * <p>
 * This class is part of the Composite design pattern, implementing the composite role.
 * It can contain child waypoints and provides functionality for managing them, including
 * recursive cleanup of child waypoints.
 * </p>
 */
@Slf4j
public class WaypointStreet extends Waypoint {
    private final String name;
    private final ArrayList<Waypoint> waypoints = new ArrayList<>();

    /**
     * Constructs a {@link WaypointStreet} with the given name.
     *
     * @param name the name of the street
     */
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
