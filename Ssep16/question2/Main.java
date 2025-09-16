package Ssep16.question2;

public class Main {
    public static void main(String[] args) {
        // Create teachers
        Teacher t1 = new Teacher("Alice");
        Teacher t2 = new Teacher("Bob");

        // Create courses
        Course c1 = new Course("Math");
        Course c2 = new Course("Physics");
        Course c3 = new Course("Chemistry");

        // Establish relationships
        t1.addCourse(c1);
        t1.addCourse(c2);

        t2.addCourse(c2);
        t2.addCourse(c3);

        // Print all teachers with their courses
        t1.printCourses();
        t2.printCourses();

        // Print all courses with their teachers
        c1.printTeachers();
        c2.printTeachers();
        c3.printTeachers();
    }
}

