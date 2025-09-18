package sep17.queston3;

public class WalletPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Wallet.");
    }
}
