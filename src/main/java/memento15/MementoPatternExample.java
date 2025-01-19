package memento15;

import memento15.flightplan.FlightPlan;
import memento15.memento.FlightPlanManager;

// Demonstration of Memento Design Pattern
public class MementoPatternExample {
    public static void main(String[] args) {
        FlightPlan flightPlan = new FlightPlan("AB123", "New York", "10:00 AM"); // Create the initial FlightPlan
        FlightPlanManager manager = new FlightPlanManager(); // Initialize the caretaker

        System.out.println("Initial State: " + flightPlan);

        // Save initial state
        manager.saveState(flightPlan);

        // Modify flight plan and save changes
        flightPlan.setDestination("Los Angeles"); // Update destination
        flightPlan.setDepartureTime("1:00 PM"); // Update departure time
        System.out.println("Updated State: " + flightPlan);
        manager.saveState(flightPlan); // Save the updated state

        // Another modification
        flightPlan.setDestination("San Francisco"); // Further update destination
        flightPlan.setDepartureTime("3:00 PM"); // Further update departure time
        System.out.println("Final State: " + flightPlan);

        // Undo changes by restoring the last saved state
        flightPlan.restoreFromMemento(manager.getLastSavedState());
        System.out.println("After Undo: " + flightPlan);

        // Undo again to restore the original state
        flightPlan.restoreFromMemento(manager.getLastSavedState());
        System.out.println("After Another Undo: " + flightPlan);

        // Show saved states for reference
        System.out.println("Saved States:");
        manager.listSavedStates().forEach(System.out::println);
    }
}