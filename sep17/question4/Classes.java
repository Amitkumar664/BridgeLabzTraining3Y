package sep17.question4;

// UniversitySystem.java

import java.util.*;

// Abstract Class
abstract class Person {
    protected int id;
    protected String name;
    protected String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}

// Subclass: Student
class Student extends Person {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, String> results = new HashMap<>();

    // University-wide rule
    public static final int MAX_COURSES_PER_STUDENT = 5;

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void enrollCourse(Course c) {
        if (enrolledCourses.size() < MAX_COURSES_PER_STUDENT) {
            enrolledCourses.add(c);
            System.out.println(name + " enrolled in " + c.getCourseName());
        } else {
            System.out.println("Enrollment failed! Max course limit reached.");
        }
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addResult(Course c, String grade) {
        results.put(c, grade);
    }

    public Map<Course, String> getResults() {
        return results;
    }
}

// Subclass: Professor
class Professor extends Person {
    private List<Course> courses = new ArrayList<>();

    public Professor(int id, String name, String email) {
        super(id, name, email);
    }

    public void assignCourse(Course c) {
        courses.add(c);
    }

    public List<Course> getCourses() {
        return courses;
    }
}

// Composition: Syllabus (cannot exist without a Course)
class Syllabus {
    private String content;

    public Syllabus(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Interface
interface Evaluatable {
    void conductExam(Student s);
    void evaluateStudent(Student s);
}

// Abstract Course Class
abstract class Course implements Evaluatable {
    protected final String courseCode; // Immutable
    protected String courseName;
    protected Professor professor;
    protected Syllabus syllabus;

    public Course(String code, String name, Professor prof, String syllabusContent) {
        this.courseCode = code;
        this.courseName = name;
        this.professor = prof;
        this.syllabus = new Syllabus(syllabusContent);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}

// TheoryCourse (Polymorphism)
class TheoryCourse extends Course {
    public TheoryCourse(String code, String name, Professor prof, String syllabusContent) {
        super(code, name, prof, syllabusContent);
    }

    @Override
    public void conductExam(Student s) {
        System.out.println("Conducting written exam for " + courseName);
    }

    @Override
    public void evaluateStudent(Student s) {
        s.addResult(this, "A"); // dummy grade
    }
}

// LabCourse (Polymorphism)
class LabCourse extends Course {
    public LabCourse(String code, String name, Professor prof, String syllabusContent) {
        super(code, name, prof, syllabusContent);
    }

    @Override
    public void conductExam(Student s) {
        System.out.println("Conducting lab practical for " + courseName);
    }

    @Override
    public void evaluateStudent(Student s) {
        s.addResult(this, "B+"); // dummy grade
    }
}

// Transcript Generator
class TranscriptGenerator {
    public static void generateTranscript(Student s) {
        System.out.println("\n--- Transcript for " + s.getName() + " ---");
        for (Course c : s.getEnrolledCourses()) {
            String grade = s.getResults().getOrDefault(c, "Not Evaluated");
            System.out.println(c.getCourseCode() + " - " + c.getCourseName() + " : " + grade);
        }
    }
}

