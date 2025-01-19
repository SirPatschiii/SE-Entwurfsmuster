package mediator14;

// FlightPlanning module
public class FlightPlanning extends Component {
    public FlightPlanning(Mediator mediator) {
        super(mediator);
    }

    public void scheduleFlight(Flight flight) {
        System.out.println("FlightPlanning: Scheduling flight " + flight.getFlightId());
        mediator.notify(this, "FlightScheduled");
    }

    public void cancelFlight(Flight flight) {
        System.out.println("FlightPlanning: Canceling flight " + flight.getFlightId());
        mediator.notify(this, "FlightCanceled");
    }
}

