package JavaString.level1;

import java.util.Scanner;

public class TextToUpperCase {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String txt = sc.nextLine();

        String upper1 = "";
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upper1 += (char)(ch - 32);
            } else {
                upper1 += ch;
            }
        }

        String upper2 = txt.toUpperCase();

        boolean same = upper1.equals(upper2);

        System.out.println("Uppercase using charAt(): " + upper1);
        System.out.println("Uppercase using toUpperCase(): " + upper2);
        System.out.println("Are both equal? " + same);
    }
    
}
