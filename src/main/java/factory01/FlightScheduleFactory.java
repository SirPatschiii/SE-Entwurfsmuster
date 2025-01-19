package factory01;

/**
 * Factory class to create instances of {@link FlightSchedule}.
 * <p>
 * This class uses the Factory Method design pattern to encapsulate the creation logic
 * for different types of flight schedules. Each method corresponds to a specific flight type,
 * setting the appropriate attributes for that type.
 * </p>
 */
public class FlightScheduleFactory {
    /**
     * Creates a {@link FlightSchedule} for a scheduled flight.
     *
     * @param origin      the origin location of the flight
     * @param destination the destination location of the flight
     * @return a {@link FlightSchedule} configured for a scheduled flight
     */
    public static FlightSchedule buildScheduledFlight(String origin, String destination) {
        FlightSchedule flightSchedule = new FlightSchedule(origin, destination);

        flightSchedule.setFlightType(EFlightType.SCHEDULED_FLIGHT);
        flightSchedule.setPlaneType(EPlaneType.SINGLE_ENGINE);
        flightSchedule.setCrewSize(3);

        return flightSchedule;
    }

    /**
     * Creates a {@link FlightSchedule} for a charter flight.
     *
     * @param origin      the origin location of the flight
     * @param destination the destination location of the flight
     * @return a {@link FlightSchedule} configured for a charter flight
     */
    public static FlightSchedule buildCharterFlight(String origin, String destination) {
        FlightSchedule flightSchedule = new FlightSchedule(origin, destination);

        flightSchedule.setFlightType(EFlightType.CHARTER_FLIGHT);
        flightSchedule.setPlaneType(EPlaneType.TWIN_ENGINE);
        flightSchedule.setCrewSize(5);

        return flightSchedule;
    }

    /**
     * Creates a {@link FlightSchedule} for a cargo flight.
     *
     * @param origin      the origin location of the flight
     * @param destination the destination location of the flight
     * @return a {@link FlightSchedule} configured for a cargo flight
     */
    public static FlightSchedule buildCargoFlight(String origin, String destination) {
        FlightSchedule flightSchedule = new FlightSchedule(origin, destination);

        flightSchedule.setFlightType(EFlightType.CARGO_FLIGHT);
        flightSchedule.setPlaneType(EPlaneType.FOUR_ENGINE);
        flightSchedule.setCrewSize(7);

        return flightSchedule;
    }
}
