package decorator06.decorator;

import decorator06.flightPlan.FlightPlan;

/**
 * A concrete decorator that adds special offer functionality to a flight plan.
 * <p>
 * This class is part of the Decorator design pattern and extends {@link FlightPlanDecorator}.
 * It modifies the attribute and cost of the decorated flight plan to include
 * special offer benefits.
 * </p>
 */
public class SpecialOfferDecorator extends FlightPlanDecorator {
    /**
     * Constructs a {@link SpecialOfferDecorator} that wraps the given flight plan.
     *
     * @param decoratedFlightPlan the flight plan to decorate
     */
    public SpecialOfferDecorator(FlightPlan decoratedFlightPlan) {
        super(decoratedFlightPlan);
    }

    @Override
    public String getAttribute() {
        return super.getAttribute() + " ,SpecialOffer";
    }

    @Override
    public double getCost() {
        return super.getCost() + 75;
    }
}
