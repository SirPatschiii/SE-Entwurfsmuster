package mediator14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Flight class
@Getter
@Setter
@AllArgsConstructor
public class Flight {
    private String flightId;
    private String status; // e.g., "Scheduled", "Delayed", "Canceled"
}
