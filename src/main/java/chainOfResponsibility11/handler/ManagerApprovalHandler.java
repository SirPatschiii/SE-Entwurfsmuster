package chainOfResponsibility11.handler;

import chainOfResponsibility11.shared.Flight;
import state17.state.ScheduledState;

public class ManagerApprovalHandler extends FlightRequestHandler {
    @Override
    protected boolean canHandle(Flight flight) {
        // Simulate manager approval condition
        return flight.getCurrentState() instanceof ScheduledState;
    }

    @Override
    protected void process(Flight flight) {
        System.out.println("ManagerApprovalHandler: Flight " + flight.getFlightId() + " approved by manager.");
        flight.updateState(flight.getInTheAirState());
    }
}
