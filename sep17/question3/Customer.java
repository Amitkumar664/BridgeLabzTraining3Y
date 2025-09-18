package sep17.queston3;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public void placeOrder() {
        System.out.println(name + " placed a new product order.");
    }

    // Association: Customer has Orders
    public void addOrder(Order order) {
        orders.add(order);
        System.out.println(name + " has added order with ID: " + order.getOrderId());
    }
}
