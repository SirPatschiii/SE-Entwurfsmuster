package decorator06.flightPlan;

/**
 * Abstract base class for flight plans.
 * <p>
 * This class defines the common interface for both the component and its decorators
 * in the Decorator design pattern.
 * </p>
 */
public abstract class FlightPlan {
    /**
     * Gets the attribute of the flight plan.
     *
     * @return a string representing the flight plan's attributes
     */
    public abstract String getAttribute();

    /**
     * Gets the cost of the flight plan.
     *
     * @return the cost of the flight plan
     */
    public abstract double getCost();
}
