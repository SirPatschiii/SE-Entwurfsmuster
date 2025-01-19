package strategy18.flight;

import lombok.Getter;

@Getter
// Sample Flight class representing a flight with relevant attributes
public class Flight {
    private final String flightNumber;
    private final int capacity;
    private final int bookedSeats;
    private final int waitingTime;

    public Flight(String flightNumber, int capacity, int bookedSeats, int waitingTime) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.waitingTime = waitingTime;
    }

    public int getAvailableSeats() {
        return capacity - bookedSeats;
    }
}
