package flyweight08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class FlugRoute {
    private final String startFlughafen;
    private final String zielFlughafen;
// This class holds shared flight route data
    // final ensures immutability (important for Flyweight)

}