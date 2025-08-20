package ControlFlowPractices.Level1;

public class SumFor {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            // Using formula
            int sumFormula = n * (n + 1) / 2;

            // Using for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using loop    = " + sumLoop);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        sc.close();
    }
}
14️⃣ Factorial using while loop
java
Copy
Edit
import java.util.Scanner;

class FactWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        sc.close();
    }
}
