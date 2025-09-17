package sep17.queston2;

public class Passenger extends Person {
    public Passenger(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Passenger) checked in with boarding pass.");
    }

    // Association → Passenger can book flights
    public void bookFlight(Flight flight) {
        System.out.println(name + " booked flight " + flight.getFlightNumber());
    }
}

