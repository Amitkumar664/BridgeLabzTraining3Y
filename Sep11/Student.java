package Sep11;

public class Student {
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        setAge(age); // use setter for validation
        this.grade = "Not Assigned"; // default
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter and Setter for age with validation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("❌ Age cannot be negative or zero!");
        }
    }

    // Getter for grade
    public String getGrade() {
        return grade;
    }

    // Update grade based on marks
    public void updateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("❌ Invalid marks! Must be between 0 and 100.");
            return;
        }

        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
    }

    // Display student info
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
