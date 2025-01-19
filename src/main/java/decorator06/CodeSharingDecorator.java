package decorator06;

public class CodeSharingDecorator extends FlightPlanDecorator {
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
