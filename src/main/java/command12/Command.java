package command12;

import java.util.Stack;

// Abstract Command class
public abstract class Command {
    protected Flight flight;

    public Command(Flight flight) {
        this.flight = flight;
    }

    public abstract void execute();
    public abstract void undo();
}
