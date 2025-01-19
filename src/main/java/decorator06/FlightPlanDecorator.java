package decorator06;

import lombok.RequiredArgsConstructor;

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
