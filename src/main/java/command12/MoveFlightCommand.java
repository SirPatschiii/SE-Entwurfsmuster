package command12;

// Command to move a flight
public class MoveFlightCommand extends Command {
    private String previousDestination;
    private String newDestination;

    public MoveFlightCommand(Flight flight, String newDestination) {
        super(flight);
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        previousDestination = flight.getDestination();
        flight.moveFlight(newDestination);
    }

    @Override
    public void undo() {
        flight.moveFlight(previousDestination);
    }
}
