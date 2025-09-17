package sep17.queston2;

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Passenger p1 = new Passenger("Amit", 25, "9876543210");
        Pilot pilot = new Pilot("Raj", 40, "1234567890");
        CabinCrew crew = new CabinCrew("Sneha", 28, "8765432109");

        Flight f1 = new Flight("AI101");
        Flight f2 = new Flight("AI202");

        // Passenger booking flight (Association)
        p1.bookFlight(f1);

        // Airline with flights (Aggregation)
        Airline airline = new Airline(new Flight[]{f1, f2});
        airline.showFlights();

        // Ticket (Final class)
        Ticket t1 = new Ticket("TKT12345");
        t1.showTicket();

        // Polymorphism: checkIn()
        System.out.println("\n--- Polymorphism: checkIn() ---");
        Person ref;

        ref = p1;       // Dynamic method dispatch
        ref.checkIn();

        ref = pilot;    // Dynamic method dispatch
        ref.checkIn();

        ref = crew;     // Dynamic method dispatch
        ref.checkIn();

        // Pilot flying (Interface implementation)
        System.out.println("\n--- Interface (Flyable) ---");
        pilot.flyPlane();
    }
}

