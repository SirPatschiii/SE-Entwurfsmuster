package mediator14;

import lombok.Setter;

/**
 * A concrete mediator that coordinates communication between components.
 * <p>
 * This class is part of the Mediator design pattern.
 * It handles events from components and determines how they should be forwarded to other components.
 * </p>
 */
@Setter
public class FlightMediator implements IMediator {
    private Maintenance maintenance;
    private FlightPlanning flightPlanning;
    private CrewManagement crewManagement;

    @Override
    public void notify(String event, Component sender) {
        switch (event) {
            case "Event from Maintenance" -> {
                flightPlanning.receiveEvent(event + ": " + sender.getEvent());
                crewManagement.receiveEvent(event + ": " + sender.getEvent());
            }
            case "Event from FlightPlanning" -> {
                maintenance.receiveEvent(event + ": " + sender.getEvent());
                crewManagement.receiveEvent(event + ": " + sender.getEvent());
            }
            case "Event from CrewManagement" -> {
                maintenance.receiveEvent(event + ": " + sender.getEvent());
                flightPlanning.receiveEvent(event + ": " + sender.getEvent());
            }
        }
    }
}
