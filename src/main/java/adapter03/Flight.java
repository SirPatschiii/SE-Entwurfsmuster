package adapter03;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flight {
    private String flightNumber;
    private String destination;
    private String weatherForecast;
}
