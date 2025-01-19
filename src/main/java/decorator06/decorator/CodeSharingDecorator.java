package decorator06.decorator;

import decorator06.flightPlan.FlightPlan;

/**
 * A concrete decorator that adds code-sharing functionality to a flight plan.
 * <p>
 * This class is part of the Decorator design pattern and extends {@link FlightPlanDecorator}.
 * It modifies the attribute and cost of the decorated flight plan to include
 * code-sharing benefits.
 * </p>
 */
public class CodeSharingDecorator extends FlightPlanDecorator {
    /**
     * Constructs a {@link CodeSharingDecorator} that wraps the given flight plan.
     *
     * @param decoratedFlightPlan the flight plan to decorate
     */
    public CodeSharingDecorator(FlightPlan decoratedFlightPlan) {
        super(decoratedFlightPlan);
    }

    @Override
    public String getAttribute() {
        return super.getAttribute() + " ,CodeSharing";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }
}
