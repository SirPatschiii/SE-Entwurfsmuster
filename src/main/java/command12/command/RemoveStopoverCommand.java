package command12.command;

import command12.shared.Flight;

// Command to remove a stopover
public class RemoveStopoverCommand extends Command {
    private String previousStopover;

    public RemoveStopoverCommand(Flight flight) {
        super(flight);
    }

    @Override
    public void execute() {
        previousStopover = flight.getStopover();
        flight.removeStopover();
    }

    @Override
    public void undo() {
        if (previousStopover != null) {
            flight.addStopover(previousStopover);
        }
    }
}
