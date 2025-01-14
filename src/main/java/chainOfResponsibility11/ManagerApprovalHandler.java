package chainOfResponsibility11;

// Concrete handler for manager approval
class ManagerApprovalHandler extends FlightChangeHandler {
    @Override
    protected boolean process(FlightChangeRequest request) {
        System.out.println("Requesting manager approval...");
        request.setManagerApproved(true); // Mark manager approval as granted
        return true; // Continue the chain
    }
}
