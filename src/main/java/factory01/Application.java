package factory01;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Application {
    public static void main(String[] args) {
        ArrayList<FlightSchedule> flightSchedules = new ArrayList<>();

        flightSchedules.add(FlightScheduleFactory.buildCargoFlight("Berlin", "New York"));
        flightSchedules.add(FlightScheduleFactory.buildCharterFlight("Hamburg", "Berlin"));

        for (FlightSchedule flightSchedule : flightSchedules) {
            log.info(String.valueOf(flightSchedule));
        }
    }
}
