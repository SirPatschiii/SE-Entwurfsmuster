package builder02;

import bridge04.aircraft.EAircraftType;
import chainOfResponsibility11.Flight;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a flight plan, which includes details about the flight schedule,
 * plane type, distance, and stopovers.
 * <p>
 * This class uses the Builder design pattern to facilitate flexible and readable
 * construction of {@link FlightPlan} objects, especially when there are multiple
 * optional parameters involved.
 * </p>
 */
@Getter
@SuppressWarnings("all")
public class FlightPlan {
    /**
     * The flight schedule associated with this flight plan.
     */
    private final FlightSchedule flightSchedule;

    /**
     * The type of plane used for the flight.
     */
    private final EPlaneType planeType;

    /**
     * The distance of the flight in kilometers.
     */
    private final int distance;

    /**
     * The weather for the flight.
     */
    private final String weather;

    /**
     * The aircraft type of the flight.
     */
    private final EAircraftType aircraftType;

    /**
     * The list of stopovers for the flight.
     */
    private final ArrayList<String> stopovers;

    /**
     * Private constructor to enforce the use of the {@link FlightPlanBuilder}.
     *
     * @param builder the builder instance used to create the {@link FlightPlan}
     */
    private FlightPlan(FlightPlanBuilder builder) {
        this.flightSchedule = builder.flightSchedule;
        this.planeType = builder.planeType;
        this.distance = builder.distance;
        this.weather = builder.weather;
        this.aircraftType = builder.aircraftType;
        this.stopovers = builder.stopovers;
    }

    /**
     * Creates a {@link Flight} from the given attributes of the class.
     *
     * @return the flight create from the attributes of {@link FlightPlan}
     */
    public Flight createFlight() {
        Random r = new Random();
        return new Flight(String.valueOf(r.nextInt()), flightSchedule.getDestination());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A flight from " + flightSchedule.getOrigin() + " to " + flightSchedule.getDestination() + "\n");
        sb.append("Distance: " + distance + "nm\n");
        sb.append("Weather: " + weather + "\n");
        sb.append("Aircraft Type: " + aircraftType + "\n");
        sb.append("Stopovers: " + stopovers + "\n");
        return sb.toString();
    }

    /**
     * Builder class for constructing instances of {@link FlightPlan}.
     * <p>
     * Implements the Builder design pattern to provide a step-by-step
     * construction process, allowing for optional parameters and improved
     * readability.
     * </p>
     */
    public static class FlightPlanBuilder {
        /**
         * The flight schedule for the flight plan (required parameter).
         */
        private final FlightSchedule flightSchedule;

        /**
         * The type of plane used for the flight (optional parameter).
         */
        private EPlaneType planeType;

        /**
         * The distance of the flight in kilometers (optional parameter).
         */
        private int distance;

        /**
         * The weather of the flight (optional parameter).
         */
        private String weather;

        /**
         * The aircraft type of the flight (optional parameter)
         */
        private EAircraftType aircraftType;

        /**
         * The list of stopovers for the flight (optional parameter).
         */
        private ArrayList<String> stopovers = new ArrayList<>();

        /**
         * Constructs a new {@link FlightPlanBuilder} with the required parameter.
         *
         * @param flightSchedule the flight schedule associated with the flight plan
         */
        public FlightPlanBuilder(FlightSchedule flightSchedule) {
            this.flightSchedule = flightSchedule;
        }

        /**
         * Sets the plane type for the flight plan.
         *
         * @param planeType the type of plane
         * @return the current instance of {@link FlightPlanBuilder}
         */
        public FlightPlanBuilder planeType(EPlaneType planeType) {
            this.planeType = planeType;
            return this;
        }

        /**
         * Sets the distance of the flight plan.
         *
         * @param distance the distance in kilometers
         * @return the current instance of {@link FlightPlanBuilder}
         */
        public FlightPlanBuilder distance(int distance) {
            this.distance = distance;
            return this;
        }

        /**
         * Sets the weather of the flight plan.
         *
         * @param weather the weather for the flight
         * @return the current instance of {@link FlightPlanBuilder}
         */
        public FlightPlanBuilder weather(String weather) {
            this.weather = weather;
            return this;
        }

        /**
         * Sets the aircraft type for the flight.
         *
         * @param aircraftType the aircraft type for the flight
         * @return the current instance of {@link FlightPlanBuilder}
         */
        public FlightPlanBuilder aircraftType(EAircraftType aircraftType) {
            this.aircraftType = aircraftType;
            return this;
        }

        /**
         * Adds a stopover to the flight plan.
         *
         * @param stopover the name of the stopover
         * @return the current instance of {@link FlightPlanBuilder}
         */
        public FlightPlanBuilder stopovers(String stopover) {
            this.stopovers.add(stopover);
            return this;
        }

        /**
         * Builds and returns a new {@link FlightPlan} instance.
         *
         * @return the constructed {@link FlightPlan}
         */
        public FlightPlan build() {
            return new FlightPlan(this);
        }
    }
}
