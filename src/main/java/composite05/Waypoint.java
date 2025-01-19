package composite05;

public abstract class Waypoint {
    public abstract void add(Waypoint waypoint);

    public abstract void remove(Waypoint waypoint);

    public abstract Waypoint getChild(int i);

    public abstract void clearSection();
}
