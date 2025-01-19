package decorator06;

public class PremiumServiceDecorator extends FlightPlanDecorator {
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
