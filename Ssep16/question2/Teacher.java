package Ssep16.question2;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Course> courses;

    public Teacher(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Add course to teacher and maintain reverse relation
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addTeacher(this);  // maintain reverse association
        }
    }

    public void printCourses() {
        System.out.print(name + " teaches: ");
        for (Course c : courses) {
            System.out.print(c.getTitle() + " ");
        }
        System.out.println();
    }
}
