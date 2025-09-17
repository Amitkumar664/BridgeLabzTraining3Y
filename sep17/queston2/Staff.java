package sep17.queston2;

public abstract class Staff extends Person {
    public Staff(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Staff) checked in for duty.");
    }
}

