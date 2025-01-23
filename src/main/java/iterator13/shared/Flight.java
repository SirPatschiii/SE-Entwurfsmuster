package iterator13.shared;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Flight class
@Getter
@Setter
@AllArgsConstructor
public class Flight {
    private String flightId;
    private String gate;
    private String destination;
}
