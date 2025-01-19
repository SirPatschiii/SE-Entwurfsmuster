package chainOfResponsibility11;

// Concrete Handlers
public class WeatherCheckHandler extends FlightRequestHandler {
    @Override
    protected boolean canHandle(Flight flight) {
        // Simulate a weather check condition
        return true; // Always passes for simplicity
    }

    @Override
    protected void process(Flight flight) {
        System.out.println("WeatherCheckHandler: Weather conditions are suitable for flight " + flight.getFlightId() + ".");
    }
}
