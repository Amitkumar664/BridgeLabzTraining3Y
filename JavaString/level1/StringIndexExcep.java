package JavaString.level1;

import java.util.Scanner;

public class StringIndexExcep {
     // Method that generates exception (no handling)
    public void genEx(String str) {
        System.out.println("Accessing invalid index:");
        // Accessing character beyond length
        System.out.println(str.charAt(str.length()));  
    }

    // Method that handles exception using try-catch
    public void handleEx(String str) {
        System.out.println("Handling exception:");
        try {
            // Invalid index access
            System.out.println(str.charAt(str.length()));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Runtime: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringIndexExcep obj = new StringIndexExcep();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // obj.genEx(input);   // Uncomment to see crash
        obj.handleEx(input);   // Safe handling

        System.out.println("Program continues...");
    }
}
