package command12.main;

import command12.command.*;
import command12.shared.Flight;

public class Application {
    public static void main(String[] args) {
        Flight flight = new Flight("LH123", "Berlin", null);
        CommandManager manager = new CommandManager();

        // Move the flight to a new destination
        Command moveCommand = new MoveFlightCommand(flight, "Munich");
        manager.executeCommand(moveCommand);

        // Add a stopover
        Command addStopoverCommand = new AddStopoverCommand(flight, "Frankfurt");
        manager.executeCommand(addStopoverCommand);

        // Remove the stopover
        Command removeStopoverCommand = new RemoveStopoverCommand(flight);
        manager.executeCommand(removeStopoverCommand);

        // Undo last command (remove stopover)
        manager.undoLastCommand();

        // Undo adding the stopover
        manager.undoLastCommand();

        // Undo moving the flight
        manager.undoLastCommand();
    }
}
