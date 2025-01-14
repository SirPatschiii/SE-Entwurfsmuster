package factory01;

/**
 * Enum representing the types of flights that can be scheduled.
 * <p>
 * This enum is used in the {@link FlightSchedule} class to specify the type
 * of flight for a given flight schedule.
 * </p>
 */
public enum EFlightType {
    /**
     * A flight that is part of a regular schedule.
     */
    SCHEDULED_FLIGHT,

    /**
     * A flight that is specifically arranged for a particular purpose or group.
     */
    CHARTER_FLIGHT,

    /**
     * A flight that is used for transporting cargo.
     */
    CARGO_FLIGHT
}
