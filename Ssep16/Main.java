package Ssep16;

// Main program to test runtime polymorphism
public class Main {
    public static void main(String[] args) {
        Payment payment;  // Reference of parent type

        // Using CreditCard
        payment = new CreditCard();
        payment.pay(1000.50);

        // Using DebitCard
        payment = new DebitCard();
        payment.pay(500.75);

        // Using UPI
        payment = new UPI();
        payment.pay(250.00);
    }
}

