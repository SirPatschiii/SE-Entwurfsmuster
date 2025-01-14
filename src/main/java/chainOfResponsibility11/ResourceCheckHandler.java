package chainOfResponsibility11;

// Concrete handler for checking resource availability
public class ResourceCheckHandler extends FlightChangeHandler {
    @Override
    protected boolean process(FlightChangeRequest request) {
        System.out.println("Checking resources...");
        request.setResourcesChecked(true); // Mark resources as checked
        return true; // Continue the chain
    }
}
