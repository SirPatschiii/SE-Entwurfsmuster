package factory01;

import lombok.Data;

/**
 * Represents a flight schedule with specific details about the flight's origin, destination,
 * type, plane type, and crew size.
 * <p>
 * This class is a simple data container used in conjunction with the Factory Method pattern
 * implemented in {@link FlightScheduleFactory}. It uses Lombok's {@code @Data} annotation
 * to generate boilerplate code such as getters, setters, and constructors automatically.
 * </p>
 */
@Data
public class FlightSchedule {
    /**
     * The origin location of the flight.
     */
    private final String origin;

    /**
     * The destination location of the flight.
     */
    private final String destination;

    /**
     * The type of the flight (e.g., Scheduled, Charter, or Cargo).
     */
    private EFlightType flightType;

    /**
     * The type of plane used for the flight (e.g., Single Engine, Twin Engine, or Four Engine).
     */
    private EPlaneType planeType;

    /**
     * The size of the crew required for the flight.
     */
    private int crewSize;
}
