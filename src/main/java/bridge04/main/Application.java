package bridge04.main;

import bridge04.aircraft.CargoAircraft;
import bridge04.aircraft.EAircraftType;
import bridge04.aircraft.IAircraftFleet;
import bridge04.aircraft.PassengerAircraft;
import bridge04.planner.CargoFlightPlanner;
import bridge04.planner.FlightPlanner;
import bridge04.planner.PassengerFlightPlanner;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        IAircraftFleet cargoBoeing = new CargoAircraft(EAircraftType.BOEING_747); // Creating a concrete implementor.
        IAircraftFleet passengerCessna = new PassengerAircraft(EAircraftType.CESSNA_172); // Creating another concrete implementor.

        // Flight Planners
        FlightPlanner cargoPlanner = new CargoFlightPlanner(cargoBoeing); // Linking the implementor with the abstraction.
        FlightPlanner passengerPlanner = new PassengerFlightPlanner(passengerCessna); // Linking another implementor with another abstraction.

        // Plan Flights
        List<String> routes = Arrays.asList("New York to London", "San Francisco to Tokyo", "Berlin to Madrid");
        routes.stream().forEach(route -> {
            cargoPlanner.planFlight(route);
            passengerPlanner.planFlight(route);
        });
    }
}
