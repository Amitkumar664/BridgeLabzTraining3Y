package Sep11;

public class StudentMain {
      public static void main(String[] args) {
        Student s1 = new Student("Amit", 20);
        Student s2 = new Student("Ravi", -5); // Invalid age test

        s1.updateGrade(85);  // Valid
        s2.updateGrade(105); // Invalid marks

        System.out.println("\n--- Student 1 ---");
        s1.displayDetails();

        System.out.println("\n--- Student 2 ---");
        s2.displayDetails();
    }
}
