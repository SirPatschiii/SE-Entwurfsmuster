package bridge04;

// Implementor
// It defines the operations that the concrete implementations must provide.
public interface IAircraftFleet {
    String getAircraftType();
    void performFlightOperation();
}
