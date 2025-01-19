package mediator14;

// Maintenance module
public class Maintenance extends Component {
    public Maintenance(Mediator mediator) {
        super(mediator);
    }

    public void performMaintenance(Flight flight) {
        System.out.println("Maintenance: Performing maintenance on flight " + flight.getFlightId());
    }

    public void completeMaintenance(Flight flight) {
        System.out.println("Maintenance: Maintenance completed for flight " + flight.getFlightId());
        mediator.notify(this, "MaintenanceCompleted");
    }
}
