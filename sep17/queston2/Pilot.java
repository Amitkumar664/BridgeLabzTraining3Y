package sep17.queston2;

// Pilot is a Staff and also Flyable
public class Pilot extends Staff implements Flyable {
    public Pilot(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Pilot";
    }

    @Override
    public void flyPlane() {
        System.out.println(name + " is flying the plane.");
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Pilot) checked in and ready to fly.");
    }
}

