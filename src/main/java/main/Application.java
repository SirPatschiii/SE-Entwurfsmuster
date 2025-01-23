package main;

import adapter03.IWeatherTarget;
import adapter03.WeatherAdapter;
import bridge04.aircraft.EAircraftType;
import bridge04.aircraft.IAircraftFleet;
import bridge04.aircraft.PassengerAircraft;
import bridge04.planner.FlightPlanner;
import bridge04.planner.PassengerFlightPlanner;
import builder02.EPlaneType;
import builder02.FlightPlan;
import builder02.FlightSchedule;
import chainOfResponsibility11.shared.Flight;
import chainOfResponsibility11.handler.ManagerApprovalHandler;
import chainOfResponsibility11.handler.ResourceCheckHandler;
import chainOfResponsibility11.handler.WeatherCheckHandler;
import composite05.WaypointIntersection;
import composite05.WaypointStreet;
import facade07.facade.FlightPlannerFacade;
import facade07.subsystem.ERouteStatus;
import guard21.check.CrewCheck;
import guard21.check.FlugzeugCheck;
import guard21.check.Guard;
import guard21.model.FlugStatus;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@SuppressWarnings("all")
public class Application {
    public static void main(String[] args) {
        String origin = "EDDM"; // Munich
        String destination = "EDDF"; // Frankfurt
        String route = origin + "-" + destination;

        // Define the flight schedule
        FlightSchedule flightSchedule = new FlightSchedule(origin, destination);
        // Define the plane type
        EAircraftType planeType = EAircraftType.AIRBUS_A320;

        // Create waypoints for the flight plan
        WaypointStreet waypointStreet1 = new WaypointStreet("SID");
        WaypointStreet waypointStreet2 = new WaypointStreet("Y101");
        WaypointStreet waypointStreet3 = new WaypointStreet("T161");
        WaypointStreet waypointStreet4 = new WaypointStreet("STAR");

        waypointStreet1.add(new WaypointIntersection(origin));
        waypointStreet1.add(new WaypointIntersection("GIVMI"));
        waypointStreet2.add(new WaypointIntersection("GIVMI"));
        waypointStreet2.add(new WaypointIntersection("ERNAS"));
        waypointStreet3.add(new WaypointIntersection("ERNAS"));
        waypointStreet3.add(new WaypointIntersection("ASPAT"));
        waypointStreet4.add(new WaypointIntersection("ASPAT"));
        waypointStreet4.add(new WaypointIntersection(destination));

        // Create the weather forecast for the flight
        IWeatherTarget weatherAdapter = new WeatherAdapter();
        String weatherForecast = weatherAdapter.getWeather(destination);

        // Create the flight plan with the given waypoints, weather and the flight schedule
        FlightPlan flightPlan = new FlightPlan.FlightPlanBuilder(flightSchedule)
                .planeType(EPlaneType.TWIN_ENGINE)
                .aircraftType(planeType)
                .distance(165)
                .stopovers(waypointStreet1.toString())
                .stopovers(waypointStreet2.toString())
                .stopovers(waypointStreet3.toString())
                .stopovers(waypointStreet4.toString())
                .weather(weatherForecast)
                .build();
        System.out.println(flightPlan.toString());

        WeatherCheckHandler weatherCheck = new WeatherCheckHandler();
        ResourceCheckHandler resourceCheck = new ResourceCheckHandler();
        ManagerApprovalHandler managerApproval = new ManagerApprovalHandler();

        // Chain handlers
        weatherCheck.setNextHandler(resourceCheck);
        resourceCheck.setNextHandler(managerApproval);

        // Create flight from flight plan
        Flight flight = flightPlan.createFlight();

        // Start the chain
        System.out.println("Processing flight request:");
        weatherCheck.handleRequest(flight); // handles if all checks are passed and the flight is launched

        // Simulate waiting the delay
        System.out.println("waiting for delay to finish");

        // The flight is finally ready
        flight.updateState(flight.getWeatherApprovedState());

        // General facade for planning flights
        FlightPlannerFacade planner = new FlightPlannerFacade();
        planner.updateRouteStatus(route, ERouteStatus.ON_TIME);

        // Plan the flight in the aircraft
        IAircraftFleet passengerAircraft = new PassengerAircraft(planeType);
        FlightPlanner passengerPlanner = new PassengerFlightPlanner(passengerAircraft);

        passengerPlanner.planFlight(route);

        // Initialize flight state
        FlugStatus state = new FlugStatus(true, true);

        // List with all checks
        List<Guard> guards = List.of(
                new FlugzeugCheck(),
                new CrewCheck()
        );

        // Checks all conditions
        boolean readyForTakeoff = guards.stream()
                .allMatch(guard -> guard.check(state));

        // Shows results
        if (readyForTakeoff) {
            System.out.println("Flight approved!");
            flight.updateState(flight.getInTheAirState());
        } else {
            System.out.println("Flight not approved!");
        }

        System.out.println("Flying . . .");

        flight.updateState(flight.getLandedState());
    }
}
