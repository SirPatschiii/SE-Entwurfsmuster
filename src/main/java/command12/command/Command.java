package command12.command;

import command12.shared.Flight;

// Abstract Command class
public abstract class Command {
    protected Flight flight;

    public Command(Flight flight) {
        this.flight = flight;
    }

    public abstract void execute();
    public abstract void undo();
}
