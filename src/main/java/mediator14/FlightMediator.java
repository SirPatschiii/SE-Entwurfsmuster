package mediator14;

// Concrete Mediator
public class FlightMediator implements Mediator {
    private FlightPlanning flightPlanning;
    private CrewManagement crewManagement;
    private Maintenance maintenance;

    public void setFlightPlanning(FlightPlanning flightPlanning) {
        this.flightPlanning = flightPlanning;
    }

    public void setCrewManagement(CrewManagement crewManagement) {
        this.crewManagement = crewManagement;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof FlightPlanning && event.equals("FlightScheduled")) {
            System.out.println("Mediator: Notifying CrewManagement and Maintenance about new flight.");
            crewManagement.assignCrew(((FlightPlanning) sender).flight);
            maintenance.performMaintenance(((FlightPlanning) sender).flight);
        } else if (sender instanceof FlightPlanning && event.equals("FlightCanceled")) {
            System.out.println("Mediator: Notifying CrewManagement and Maintenance about flight cancellation.");
            crewManagement.releaseCrew(((FlightPlanning) sender).flight);
        } else if (sender instanceof Maintenance && event.equals("MaintenanceCompleted")) {
            System.out.println("Mediator: Maintenance completed. Updating flight status.");
        }
    }
}
