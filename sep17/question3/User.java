package sep17.queston;

// Abstract base class
public abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Abstract method
    public abstract String getRole();

    // Polymorphism example: placeOrder (default version)
    public void placeOrder() {
        System.out.println(name + " placed an order (generic).");
    }
}

