package mediator14;

// CrewManagement module
 public class CrewManagement extends Component {
    public CrewManagement(Mediator mediator) {
        super(mediator);
    }

    public void assignCrew(Flight flight) {
        System.out.println("CrewManagement: Assigning crew for flight " + flight.getFlightId());
    }

    public void releaseCrew(Flight flight) {
        System.out.println("CrewManagement: Releasing crew for flight " + flight.getFlightId());
    }
}

