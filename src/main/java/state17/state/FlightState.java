package state17.state;


import chainOfResponsibility11.shared.Flight;

public abstract class FlightState { // Abstract state class that all concrete states inherit from
    private final String description;

    protected FlightState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // TODO: state Specific logic ...

    public abstract boolean canTransitionTo(FlightState newState); // Validate state transition
    public abstract void handleStateChange(Flight flight);
}
