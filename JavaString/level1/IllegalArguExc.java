package JavaString.level1;

import java.util.Scanner;

public class IllegalArguExc {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String txt = sc.next();

        // Start index > end index → IllegalArgumentException
        String sub = txt.substring(5, 2);
        System.out.println("Substring: " + sub);
    }
    
    
    
}
