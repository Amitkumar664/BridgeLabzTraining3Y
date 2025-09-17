package sep17.queston2;

// Aggregation → Airline has flights but flights can exist independently
public class Airline {
    public static String airlineName = "SkyHigh Airlines";  // Static field
    private Flight[] flights;

    public Airline(Flight[] flights) {
        this.flights = flights;
    }

    public void showFlights() {
        System.out.println("Airline: " + airlineName);
        for (Flight f : flights) {
            f.flightDetails();
        }
    }
}

