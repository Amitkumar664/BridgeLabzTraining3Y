package Ssep16.question2;


import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Teacher> teachers;

    public Course(String title) {
        this.title = title;
        this.teachers = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    // Add teacher to course and maintain reverse relation
    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            teacher.addCourse(this); // maintain reverse association
        }
    }

    public void printTeachers() {
        System.out.print(title + " is taught by: ");
        for (Teacher t : teachers) {
            System.out.print(t.getName() + " ");
        }
        System.out.println();
    }
}

