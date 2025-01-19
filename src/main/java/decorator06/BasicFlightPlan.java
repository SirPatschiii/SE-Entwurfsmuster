package decorator06;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BasicFlightPlan extends FlightPlan {
    private final String name;

    @Override
    public String getAttribute() {
        return name + ": BasicFlightPlan";
    }

    @Override
    public double getCost() {
        return 300;
    }
}
