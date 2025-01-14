package chainOfResponsibility11;

// Abstract handler - Base class for all handlers in the chain
public abstract class FlightChangeHandler {
    private FlightChangeHandler nextHandler;

    // Link this handler to the next one in the chain
    public FlightChangeHandler linkWith(FlightChangeHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    // Handle method to process the request and pass it to the next handler if needed
    public void handle(FlightChangeRequest request) {
        if (process(request) && nextHandler != null) {
            nextHandler.handle(request);
        }
    }

    // Abstract method to be implemented by concrete handlers for specific processing logic
    protected abstract boolean process(FlightChangeRequest request);
}
