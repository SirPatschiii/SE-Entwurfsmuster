package bridge04;

import lombok.AllArgsConstructor;
import lombok.ToString;

// Concrete Implementor which provides specific implementation for the interface
@AllArgsConstructor
@ToString
public class CargoAircraft implements IAircraftFleet {
    private final EAircraftType type;

    @Override
    public String getAircraftType() {
        return type.name();
    }

    @Override
    public void performFlightOperation() {
        System.out.println("Carrying cargo using " + type);
    }
}
