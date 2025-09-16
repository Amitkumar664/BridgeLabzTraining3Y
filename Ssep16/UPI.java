package Ssep16;

// Subclass for UPI
public class UPI extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

