package decorator06;

public class SpecialOfferDecorator extends FlightPlanDecorator {
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
