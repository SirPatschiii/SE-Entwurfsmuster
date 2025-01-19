package decorator06;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        FlightPlan basicFlightPlan = new BasicFlightPlan("EDDM - EDDF");

        FlightPlan smallFlightPlan = new CodeSharingDecorator(basicFlightPlan);
        FlightPlan mediumFlightPlan = new PremiumServiceDecorator(smallFlightPlan);
        FlightPlan fullFlightPlan = new SpecialOfferDecorator(mediumFlightPlan);

        log.info("basicFlightPlan: {} | cost: {}", basicFlightPlan.getAttribute(), basicFlightPlan.getCost());
        log.info("smallFlightPlan: {} | cost: {}", smallFlightPlan.getAttribute(), smallFlightPlan.getCost());
        log.info("mediumFlightPlan: {} | cost: {}", mediumFlightPlan.getAttribute(), mediumFlightPlan.getCost());
        log.info("fullFlightPlan: {} | cost: {}", fullFlightPlan.getAttribute(), fullFlightPlan.getCost());
    }
}
