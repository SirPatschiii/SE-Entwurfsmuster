package decorator06;

import lombok.RequiredArgsConstructor;

/**
 * Abstract base class for flight plan decorators.
 * <p>
 * This class is part of the Decorator design pattern and serves as the abstract decorator.
 * It wraps a {@link FlightPlan} and delegates method calls to the decorated object, while
 * allowing subclasses to add additional behavior.
 * </p>
 */
@RequiredArgsConstructor
public abstract class FlightPlanDecorator extends FlightPlan {
    protected final FlightPlan decoratedFlightPlan;

    @Override
    public String getAttribute() {
        return decoratedFlightPlan.getAttribute();
    }

    @Override
    public double getCost() {
        return decoratedFlightPlan.getCost();
    }
}
