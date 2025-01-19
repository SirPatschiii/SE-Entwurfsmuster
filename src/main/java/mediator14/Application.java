package mediator14;

public class Application {
    public static void main(String[] args) {
        FlightMediator mediator = new FlightMediator();

        Maintenance maintenance = new Maintenance(mediator);
        FlightPlanning flightPlanning = new FlightPlanning(mediator);
        CrewManagement crewManagement = new CrewManagement(mediator);

        mediator.setMaintenance(maintenance);
        mediator.setFlightPlanning(flightPlanning);
        mediator.setCrewManagement(crewManagement);

        maintenance.sendEvent("Maintenance completed");
        flightPlanning.sendEvent("FlightPlanning completed");
        crewManagement.sendEvent("CrewManagement completed");
    }
}
