package adapter03;

// Adaptee Class
// This represents the existing third-party weather service, which provides data in a specific format.
public class ThirdPartyWeatherService {
    public String fetchWeatherData(String city) {
        // Simulierte Wetterdaten
        return switch (city.toLowerCase()) {
            case "berlin" -> "CLOUDY";
            case "paris" -> "SUNNY";
            case "london" -> "RAINY";
            default -> "UNKNOWN";
        };
    }
}
