package sep17.queston3;

public class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " via UPI.");
    }
}

