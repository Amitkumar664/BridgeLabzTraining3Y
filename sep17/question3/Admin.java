package sep17.queston3;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    // Admin-specific actions
    public void managePlatform() {
        System.out.println("Admin " + name + " is managing the platform.");
    }
}
