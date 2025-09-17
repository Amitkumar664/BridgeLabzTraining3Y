package sep17.queston2;

// Final class → cannot be inherited
public final class Ticket {
    private String ticketNumber;

    public Ticket(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void showTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
    }
}

