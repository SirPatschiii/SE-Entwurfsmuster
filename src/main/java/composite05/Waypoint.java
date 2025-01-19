package composite05;

/**
 * Abstract base class representing a waypoint in a navigation structure.
 * <p>
 * This class is part of the Composite design pattern, acting as the abstract component.
 * Subclasses, such as {@link WaypointIntersection} and {@link WaypointStreet}, implement
 * the methods for adding, removing, and managing child waypoints.
 * </p>
 */
@SuppressWarnings("unused")
public abstract class Waypoint {
    /**
     * Adds a child waypoint to this waypoint.
     *
     * @param waypoint the child waypoint to add
     */
    public abstract void add(Waypoint waypoint);

    /**
     * Removes a child waypoint from this waypoint.
     *
     * @param waypoint the child waypoint to remove
     */
    public abstract void remove(Waypoint waypoint);

    /**
     * Retrieves a child waypoint at the specified index.
     *
     * @param i the index of the child waypoint to retrieve
     * @return the child waypoint at the specified index
     */
    public abstract Waypoint getChild(int i);

    /**
     * Clears the section represented by this waypoint, performing any necessary cleanup.
     */
    public abstract void clearSection();
}
