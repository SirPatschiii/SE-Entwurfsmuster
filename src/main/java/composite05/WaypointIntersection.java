package composite05;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Represents an intersection in the waypoint structure.
 * <p>
 * This class is part of the Composite design pattern, implementing the composite role.
 * It can contain child waypoints and provides functionality for managing them.
 * </p>
 */
@Slf4j
public class WaypointIntersection extends Waypoint {
    private final String name;
    private final ArrayList<Waypoint> waypoints = new ArrayList<>();

    /**
     * Constructs a {@link WaypointIntersection} with the given name.
     *
     * @param name the name of the intersection
     */
    public WaypointIntersection(String name) {
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
        log.info("Cleared section in WaypointIntersection : {}", name);
    }
}
