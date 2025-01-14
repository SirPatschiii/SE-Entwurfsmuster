package main;

import chainOfResponsibility11.*;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {
    public static void main(String[] args) {

        // Chains of Responsibility
       /* // Main class to demonstrate the Chain of Responsibility
        // Create the chain of handlers - Important step for this design pattern
        FlightChangeHandler chain = new WeatherCheckHandler();
        chain.linkWith(new ResourceCheckHandler()) // Link the next handler
             .linkWith(new ManagerApprovalHandler()); // Link the final handler

        // Create a flight change request
        FlightChangeRequest request = new FlightChangeRequest("FL123", false, false, false);

        // Process the request through the chain
        chain.handle(request);

        // Verify the request state after processing
        System.out.println("Weather Checked: " + request.isWeatherConditionsChecked());
        System.out.println("Resources Checked: " + request.isResourcesChecked());
        System.out.println("Manager Approved: " + request.isManagerApproved()); */
    }
}
