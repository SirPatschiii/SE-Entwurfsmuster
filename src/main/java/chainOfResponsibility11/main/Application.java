package chainOfResponsibility11.main;

import chainOfResponsibility11.handler.ManagerApprovalHandler;
import chainOfResponsibility11.handler.ResourceCheckHandler;
import chainOfResponsibility11.handler.WeatherCheckHandler;
import chainOfResponsibility11.shared.Flight;

public class Application {

    public static void main(String[] args) {
        // Create handlers
        WeatherCheckHandler weatherCheck = new WeatherCheckHandler();
        ResourceCheckHandler resourceCheck = new ResourceCheckHandler();
        ManagerApprovalHandler managerApproval = new ManagerApprovalHandler();

        // Chain handlers
        weatherCheck.setNextHandler(resourceCheck);
        resourceCheck.setNextHandler(managerApproval);

        // Create a flight request
        Flight flight = new Flight("LH123", "Berlin");

        // Start the chain
        System.out.println("Processing flight request:");
        weatherCheck.handleRequest(flight);
    }
}
