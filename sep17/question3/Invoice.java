package sep17.queston3;


// Composition: Invoice cannot exist without Order
public class Invoice {
    private String invoiceNumber;

    public Invoice(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void printInvoice() {
        System.out.println("Invoice generated: " + invoiceNumber);
    }
}
