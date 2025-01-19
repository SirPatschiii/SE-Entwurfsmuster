package builder02;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

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
@ToString
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
        this.stopovers = builder.stopovers;
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
