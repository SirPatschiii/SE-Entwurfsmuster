package adapter03;

import java.util.Arrays;

// Adapter Class
// This is where the Adapter Pattern is applied, combining inheritance and interface implementation.
public class WeatherAdapter extends ThirdPartyWeatherService implements IWeatherTarget{
    @Override
    public String getWeather(String location) {
        String rawWeatherData = fetchWeatherData(location);

        return Arrays.stream(EWeatherCondition.values())
                .map(Enum::name)
                .filter(rawWeatherData::equalsIgnoreCase)
                .findFirst()
                .orElse("NO_DATA_AVAILABLE");
    }
}
