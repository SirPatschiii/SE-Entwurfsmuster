package chainOfResponsibility11;

public class ResourceCheckHandler extends FlightRequestHandler {
    @Override
    protected boolean canHandle(Flight flight) {
        // Simulate resource availability check
        return true; // Always passes for simplicity
    }

    @Override
    protected void process(Flight flight) {
        System.out.println("ResourceCheckHandler: Resources are available for flight " + flight.getFlightId() + ".");
    }
}
