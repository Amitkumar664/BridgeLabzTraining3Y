package sep17.question4;

// Main.java

public class Main {
    public static void main(String[] args) {
        // Professors
        Professor prof1 = new Professor(1, "Dr. Sharma", "sharma@uni.edu");
        Professor prof2 = new Professor(2, "Dr. Verma", "verma@uni.edu");

        // Courses
        Course c1 = new TheoryCourse("CS101", "Data Structures", prof1, "Stacks, Queues, Trees");
        Course c2 = new LabCourse("CS102", "Data Structures Lab", prof1, "Lab Assignments");
        Course c3 = new TheoryCourse("CS201", "Algorithms", prof2, "Sorting, Searching, Graphs");

        prof1.assignCourse(c1);
        prof1.assignCourse(c2);
        prof2.assignCourse(c3);

        // Student
        Student s1 = new Student(101, "Amit", "amit@uni.edu");

        // Enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s1.enrollCourse(c3);

        // Exams & Evaluation
        c1.conductExam(s1);
        c1.evaluateStudent(s1);

        c2.conductExam(s1);
        c2.evaluateStudent(s1);

        c3.conductExam(s1);
        c3.evaluateStudent(s1);

        // Transcript
        TranscriptGenerator.generateTranscript(s1);
    }
}

