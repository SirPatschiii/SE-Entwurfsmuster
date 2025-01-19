package strategy18.strategy;

import strategy18.flight.Flight;

import java.util.List;


/**
 * Abstract base class representing a flight planning strategy.
 *
 * This follows the Strategy Pattern, which allows defining multiple strategies
 * for flight planning and dynamically switching between them.
 *
 * Why use the Strategy Pattern?
 * - It promotes code reusability by encapsulating different strategies in separate classes.
 * - It makes the system more flexible, as new strategies can be added without modifying existing code.
 * - It adheres to the Open/Closed Principle, as new behavior can be introduced without altering the base class.
 */
public abstract class Strategy {
    /**
     * Executes the specific strategy logic and returns a list of flights sorted accordingly.
     *
     * Each concrete subclass must implement this method with its own sorting logic.
     */
    public abstract List<Flight> execute(List<Flight> flights);
}
