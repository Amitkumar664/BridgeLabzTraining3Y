package sep17.queston3;

import java.util.List;

// Aggregation: Marketplace has Sellers and Customers
public class Marketplace {
    private List<Seller> sellers;
    private List<Customer> customers;

    // Static block to load configurations
    static {
        System.out.println("Marketplace configurations loaded.");
    }

    public Marketplace(List<Seller> sellers, List<Customer> customers) {
        this.sellers = sellers;
        this.customers = customers;
    }

    public void showUsers() {
        System.out.println("--- Sellers ---");
        for (Seller s : sellers) {
            System.out.println(s.name + " (" + s.getRole() + ")");
        }

        System.out.println("--- Customers ---");
        for (Customer c : customers) {
            System.out.println(c.name + " (" + c.getRole() + ")");
        }
    }

    // final method
    public final void termsAndConditions() {
        System.out.println("Marketplace terms and conditions apply to all users.");
    }
}
