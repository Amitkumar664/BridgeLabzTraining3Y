package JavaString.level1;

import java.util.Scanner;

public class IllegalArguExc {
       // Method that generates exception (no handling)
    public void genEx(String str) {
        System.out.println("Generating exception:");
        // Invalid: start > end
        System.out.println(str.substring(5, 2));
    }

    // Method that handles exception using try-catch
    public void handleEx(String str) {
        System.out.println("Handling exception:");
        try {
            // Invalid substring indices
            System.out.println(str.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Runtime: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IllegalArguExc obj = new IllegalArguExc();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // obj.genEx(input);    // Uncomment to see abrupt crash
        obj.handleEx(input);    // Safe handling

        System.out.println("Program continues...");
    }
    
    
    
}
