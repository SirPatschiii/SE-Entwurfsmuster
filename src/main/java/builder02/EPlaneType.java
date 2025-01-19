package builder02;

import factory01.FlightSchedule;

/**
 * Enum representing the types of planes that can be used for a flight.
 * <p>
 * This enum is used in the {@link FlightSchedule} class to specify the plane type
 * for a given flight schedule.
 * </p>
 */
public enum EPlaneType {
    /**
     * A plane with a single engine.
     */
    SINGLE_ENGINE,

    /**
     * A plane with two engines.
     */
    TWIN_ENGINE,

    /**
     * A plane with four engines.
     */
    FOUR_ENGINE
}
