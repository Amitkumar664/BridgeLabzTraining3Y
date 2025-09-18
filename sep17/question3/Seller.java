package sep17.queston3;

public class Seller extends User {
    public Seller(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "Seller";
    }

    @Override
    public void placeOrder() {
        System.out.println(name + " listed a new product for sale.");
    }
}

