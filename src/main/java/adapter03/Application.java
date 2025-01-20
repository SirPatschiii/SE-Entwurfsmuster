package adapter03;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        IWeatherTarget weatherAdapter = new WeatherAdapter();

        // Beispiel-Flüge
        List<Flight> flights = List.of(
                new Flight("LH123", "Frankfurt", weatherAdapter.getWeather("EDDF")),
                new Flight("AF456", "Muenchen", weatherAdapter.getWeather("EDDM")),
                new Flight("BA789", "Hamburg", weatherAdapter.getWeather("EDDH")),
                new Flight("UA101", "Berlin", weatherAdapter.getWeather("EDDB"))
        );

        // Flüge mit Wettervorhersage anzeigen
        flights.forEach(flight -> System.out.printf("Flight %s to %s has weather: %s%n",
                flight.getFlightNumber(), flight.getDestination(), flight.getWeatherForecast()));
    }
}
