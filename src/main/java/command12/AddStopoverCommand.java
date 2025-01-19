package command12;

// Command to add a stopover
public class AddStopoverCommand extends Command {
    private String newStopover;
    private String previousStopover;

    public AddStopoverCommand(Flight flight, String newStopover) {
        super(flight);
        this.newStopover = newStopover;
    }

    @Override
    public void execute() {
        previousStopover = flight.getStopover();
        flight.addStopover(newStopover);
    }

    @Override
    public void undo() {
        if (previousStopover == null) {
            flight.removeStopover();
        } else {
            flight.addStopover(previousStopover);
        }
    }
}
