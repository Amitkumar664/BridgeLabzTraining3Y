package sep17.queston3;

// Composition: Order has Invoice
public class Order {
    private String orderId;
    private Invoice invoice;

    public Order(String orderId) {
        this.orderId = orderId;
        this.invoice = new Invoice("INV-" + orderId); // Invoice created with Order
    }

    public String getOrderId() {
        return orderId;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        invoice.printInvoice();
    }
}

