package adapter03;

// Adaptee Class
// This represents the existing third-party weather service, which provides data in a specific format.
public class ThirdPartyWeatherService {
    public String fetchWeatherData(String location) {
        // Simulierte Wetterdaten
        return switch (location) {
            case "EDDF" -> "CLOUDY";
            case "EDDM" -> "SUNNY";
            case "EDDH" -> "RAINY";
            default -> "UNKNOWN";
        };
    }
}
