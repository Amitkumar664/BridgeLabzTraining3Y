package sep17.queston3;

public interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}
