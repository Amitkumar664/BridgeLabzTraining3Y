package sep17.queston2;

// Abstract Base Class
public abstract class Person {
    protected String name;
    protected int age;
    protected String contact;

    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    // Abstract method
    public abstract String getRole();

    // Method for Polymorphism (overridden later)
    public void checkIn() {
        System.out.println("Person is checking in.");
    }
}

