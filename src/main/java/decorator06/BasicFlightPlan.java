package decorator06;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Represents a basic flight plan with a default attribute and cost.
 * <p>
 * This class acts as the Concrete Component in the Decorator design pattern.
 * It provides the core functionality that decorators can extend.
 * </p>
 */
@RequiredArgsConstructor
@Getter
public class BasicFlightPlan extends FlightPlan {
    private final String name;

    /**
     * Gets the attribute of the basic flight plan.
     *
     * @return a string representing the attribute of the flight plan
     */
    @Override
    public String getAttribute() {
        return name + ": BasicFlightPlan";
    }

    /**
     * Gets the cost of the basic flight plan.
     *
     * @return the cost of the flight plan
     */
    @Override
    public double getCost() {
        return 300;
    }
}
