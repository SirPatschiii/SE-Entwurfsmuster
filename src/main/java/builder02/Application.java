package builder02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        FlightSchedule flightSchedule = new FlightSchedule("EDDM", "EDDF");
        FlightPlan flightPlan = new FlightPlan.FlightPlanBuilder(flightSchedule)
                .planeType(EPlaneType.TWIN_ENGINE)
                .distance(165)
                .stopovers("GIVMI")
                .stopovers("ERNAS")
                .stopovers("ASPAT")
                .build();
        log.info(flightPlan.toString());
    }
}
