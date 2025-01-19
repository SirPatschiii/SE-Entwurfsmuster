package strategy18;

import strategy18.flight.Flight;
import strategy18.strategy.MaximizeCapacity;
import strategy18.strategy.MinimizeWaitingTime;
import strategy18.strategy.Strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyExample {
    public static void main(String[] args) {
        // Example data representing different flights
        List<Flight> flights = Arrays.asList(
                new Flight("LH123", 200, 150, 40),
                new Flight("LH124", 180, 120, 10),
                new Flight("LH125", 220, 200, 30),
                new Flight("LH126", 150, 80, 50)
        );

        // Apply strategies
        System.out.println("--- Strategy: Minimize Waiting Time ---");
        Strategy minimizeWaitingTime = new MinimizeWaitingTime();
        List<Flight> minimizedWaitingTime = minimizeWaitingTime.execute(flights);
        minimizedWaitingTime.forEach(f -> System.out.println(f.getFlightNumber() + ": Waiting Time = " + f.getWaitingTime()));

        System.out.println("\n--- Strategy: Maximize Utilization ---");
        Strategy maximizeUtilization = new MaximizeCapacity();
        List<Flight> maximizedUtilization = maximizeUtilization.execute(flights);
        maximizedUtilization.forEach(f -> System.out.println(f.getFlightNumber() + ": Utilization = " +
                ((double) f.getBookedSeats() / f.getCapacity()) * 100 + "%"));
    }
}
