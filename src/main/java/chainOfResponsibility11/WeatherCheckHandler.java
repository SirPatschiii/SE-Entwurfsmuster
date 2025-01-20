package chainOfResponsibility11;

import state17.state.DelayedState;

// Concrete Handlers
public class WeatherCheckHandler extends FlightRequestHandler {
    private String currentWeather;
    @Override
    protected boolean canHandle(Flight flight) {
        // Simulate a weather check condition
        if (currentWeather == "SUNNY") {
            // state stays in scheduled
            return true;
        }
        else {
            flight.updateState(flight.getDelayedState());
            return false;
        }
    }

    @Override
    protected void process(Flight flight) {
        System.out.println("WeatherCheckHandler: Weather conditions are suitable for flight " + flight.getFlightId() + ".");
    }
}
