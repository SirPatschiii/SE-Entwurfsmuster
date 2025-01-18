package chainOfResponsibility11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Flight class
@Getter
@Setter
@AllArgsConstructor
class Flight {
    private String flightId;
    private String destination;
    private String status; // e.g., "Scheduled", "Pending Approval"
}
