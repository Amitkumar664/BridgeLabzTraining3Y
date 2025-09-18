package sep17.queston3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create Users
        Customer c1 = new Customer("Amit", "amit@example.com");
        Seller s1 = new Seller("Raj", "raj@sellers.com");
        Admin admin = new Admin("Sneha", "sneha@admin.com");

        // Orders & Association
        Order o1 = new Order("ORD101");
        Order o2 = new Order("ORD102");
        c1.addOrder(o1);
        c1.addOrder(o2);

        // Show order details
        o1.showOrderDetails();

        // Payment via interface
        PaymentGateway payMethod = new CreditCardPayment();
        payMethod.pay(2000.0);
        payMethod.refund(500.0);

        // Aggregation: Marketplace
        Marketplace market = new Marketplace(Arrays.asList(s1), Arrays.asList(c1));
        market.showUsers();
        market.termsAndConditions();

        // Polymorphism (Dynamic Method Dispatch)
        System.out.println("\n--- Polymorphism: placeOrder() ---");
        User ref;
        ref = c1;
        ref.placeOrder();

        ref = s1;
        ref.placeOrder();

        ref = admin;
        ref.placeOrder();

        // Anonymous Inner Class: One-time discount strategy
        System.out.println("\n--- Anonymous Inner Class for Discount ---");
        DiscountStrategy discount = new DiscountStrategy() {
            @Override
            public double applyDiscount(double amount) {
                return amount * 0.9; // 10% off
            }
        };
        double original = 1000.0;
        double discounted = discount.applyDiscount(original);
        System.out.println("Original: " + original + ", After Discount: " + discounted);
    }
}

// DiscountStrategy interface for anonymous inner class
interface DiscountStrategy {
    double applyDiscount(double amount);
}
