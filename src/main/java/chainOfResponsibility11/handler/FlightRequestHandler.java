package chainOfResponsibility11.handler;

import chainOfResponsibility11.shared.Flight;

// Abstract Handler class
public abstract class FlightRequestHandler {
    private FlightRequestHandler nextHandler;

    public void setNextHandler(FlightRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Flight flight) {
        if (canHandle(flight)) {
            process(flight);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(flight);
        } else {
            System.out.println("Request for flight " + flight.getFlightId() + " could not be processed.");
        }
    }

    protected abstract boolean canHandle(Flight flight);

    protected abstract void process(Flight flight);
}
