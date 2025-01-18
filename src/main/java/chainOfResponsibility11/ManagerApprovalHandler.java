package chainOfResponsibility11;

public class ManagerApprovalHandler extends FlightRequestHandler {
    @Override
    protected boolean canHandle(Flight flight) {
        // Simulate manager approval condition
        return "Pending Approval".equals(flight.getStatus());
    }

    @Override
    protected void process(Flight flight) {
        System.out.println("ManagerApprovalHandler: Flight " + flight.getFlightId() + " approved by manager.");
        flight.setStatus("Approved");
    }
}
