package chainOfResponsibility11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// FlightChangeRequest class - Represents the request being processed
@Getter
@Setter
@AllArgsConstructor
class FlightChangeRequest {
    private String flightId;
    private boolean weatherConditionsChecked;
    private boolean resourcesChecked;
    private boolean managerApproved;
}
