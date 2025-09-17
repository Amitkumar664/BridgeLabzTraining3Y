package sep17.queston2;

// Aggregation with Airline, Composition with Cockpit
public class Flight {
    private String flightNumber;
    private Cockpit cockpit;  // Composition

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.cockpit = new Cockpit(); // Cockpit created with Flight
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void flightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        cockpit.cockpitDetails();
    }
}

