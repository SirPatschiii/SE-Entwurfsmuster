package template19;

import lombok.extern.slf4j.Slf4j;
import template19.enums.AircraftType;
import template19.flights.EuropeanFlightPlanner;
import template19.flights.USFlightPlanner;
import template19.template.FlightPlanner;

// Application of the implementation
@Slf4j
public class FlightPlannerApp {
    public static void main(String[] args) {
        // Creating flight planners for Europe and the USA
        FlightPlanner europeanPlanner = new EuropeanFlightPlanner();
        FlightPlanner usPlanner = new USFlightPlanner();

        // Flight planning for different scenarios
        europeanPlanner.planFlight("London", "Berlin", AircraftType.MEDIUM);
        usPlanner.planFlight("Los Angeles", "Miami", AircraftType.LARGE);
    }
}