package decorator06;

import decorator06.decorator.CodeSharingDecorator;
import decorator06.decorator.PremiumServiceDecorator;
import decorator06.decorator.SpecialOfferDecorator;
import decorator06.flightPlan.BasicFlightPlan;
import decorator06.flightPlan.FlightPlan;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("SpellCheckingInspection")
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
