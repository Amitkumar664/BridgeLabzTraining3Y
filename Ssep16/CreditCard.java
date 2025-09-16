package Ssep16;

// Subclass for CreditCard
public class CreditCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

