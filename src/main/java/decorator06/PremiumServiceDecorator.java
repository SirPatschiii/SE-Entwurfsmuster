package decorator06;

/**
 * A concrete decorator that adds premium service functionality to a flight plan.
 * <p>
 * This class is part of the Decorator design pattern and extends {@link FlightPlanDecorator}.
 * It modifies the attribute and cost of the decorated flight plan to include
 * premium services.
 * </p>
 */
public class PremiumServiceDecorator extends FlightPlanDecorator {
    /**
     * Constructs a {@link PremiumServiceDecorator} that wraps the given flight plan.
     *
     * @param decoratedFlightPlan the flight plan to decorate
     */
    public PremiumServiceDecorator(FlightPlan decoratedFlightPlan) {
        super(decoratedFlightPlan);
    }

    @Override
    public String getAttribute() {
        return super.getAttribute() + " ,PremiumService";
    }

    @Override
    public double getCost() {
        return super.getCost() + 100;
    }
}
