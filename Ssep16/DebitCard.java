package Ssep16;

// Subclass for DebitCard
public class DebitCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card.");
    }
}

