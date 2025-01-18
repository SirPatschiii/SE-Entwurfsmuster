package main;

import chainOfResponsibility11.*;
import mediator14.*;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // 11: Chains of Responsibility
        // Create handlers
        /* WeatherCheckHandler weatherCheck = new WeatherCheckHandler();
        ResourceCheckHandler resourceCheck = new ResourceCheckHandler();
        ManagerApprovalHandler managerApproval = new ManagerApprovalHandler();

        // Chain handlers
        weatherCheck.setNextHandler(resourceCheck);
        resourceCheck.setNextHandler(managerApproval);

        // Create a flight request
        Flight flight = new Flight("LH123", "Berlin", "Pending Approval");

        // Start the chain
        System.out.println("Processing flight request:");
        weatherCheck.handleRequest(flight);

        // Check final status
        System.out.println("Final status of flight " + flight.getFlightId() + ": " + flight.getStatus()); */


        // 12: Command
        /* Flight flight = new Flight("LH123", "Berlin", null);
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
        manager.undoLastCommand(); */


        // 13: Iterator
        /* FlightCollection flightCollection = new FlightCollection();
        flightCollection.addFlight(new Flight("LH123", "A1", "Berlin"));
        flightCollection.addFlight(new Flight("LH124", "A1", "Munich"));
        flightCollection.addFlight(new Flight("LH125", "B2", "Hamburg"));
        flightCollection.addFlight(new Flight("LH126", "B3", "Frankfurt"));

        // Iterate over flights using the custom iterator
        FlightIterator iterator = flightCollection.iterator();
        System.out.println("Iterating over flights:");
        while (iterator.hasNext()) {
            iterator13.Flight flight = iterator.next();
            System.out.println("Flight ID: " + flight.getFlightId() + ", Gate: " + flight.getGate() + ", Destination: " + flight.getDestination());
        }

        // Detect conflicts
        ConflictDetector conflictDetector = new ConflictDetector();
        List<Conflict> conflicts = conflictDetector.detectConflicts(flightCollection);

        System.out.println("\nConflicts detected:");
        for (Conflict conflict : conflicts) {
            System.out.println("Conflict Type: " + conflict.getType() + ", Flights: " + conflict.getFlight1().getFlightId() + " and " + conflict.getFlight2().getFlightId());
        } */


        // 14: Mediator
        /* FlightMediator mediator = new FlightMediator();

        FlightPlanning flightPlanning = new FlightPlanning(mediator);
        CrewManagement crewManagement = new CrewManagement(mediator);
        Maintenance maintenance = new Maintenance(mediator);

        mediator.setFlightPlanning(flightPlanning);
        mediator.setCrewManagement(crewManagement);
        mediator.setMaintenance(maintenance);

        Flight flight = new Flight("LH123", "Scheduled");

        // Schedule a flight
        flightPlanning.scheduleFlight(flight);

        // Complete maintenance for the flight
        maintenance.completeMaintenance(flight);

        // Cancel the flight
        flightPlanning.cancelFlight(flight); */
    }
}
