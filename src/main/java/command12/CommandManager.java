package command12;

import java.util.Stack;

// Command Manager to handle execution and undo of commands
public class CommandManager {
    private Stack<Command> commandStack = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandStack.push(command);
    }

    public void undoLastCommand() {
        if (!commandStack.isEmpty()) {
            Command lastCommand = commandStack.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }
}
