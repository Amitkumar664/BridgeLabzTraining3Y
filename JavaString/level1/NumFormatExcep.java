package JavaString.level1;

import java.util.Scanner;

public class NumFormatExcep {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String txt = sc.next();

        // If input is not numeric → NumberFormatException
        int num = Integer.parseInt(txt);
        System.out.println("Converted number: " + num);
    }
    
}
