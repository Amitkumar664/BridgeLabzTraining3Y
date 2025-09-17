package sep17.queston2;

public class CabinCrew extends Staff {
    public CabinCrew(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Cabin Crew";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Cabin Crew) checked in and assisting passengers.");
    }
}

