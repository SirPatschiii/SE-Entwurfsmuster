package chainOfResponsibility11;

// Concrete handler for checking weather conditions
public class WeatherCheckHandler extends FlightChangeHandler {
    @Override
    protected boolean process(FlightChangeRequest request) {
        System.out.println("Checking weather conditions...");
        request.setWeatherConditionsChecked(true); // Mark weather as checked
        return true; // Continue the chain
    }
}
