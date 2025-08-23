package JavaString.level1;

import java.util.Scanner;

public class TextToLowerCase {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String txt = sc.nextLine();

        String lower1 = "";
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lower1 += (char)(ch + 32);
            } else {
                lower1 += ch;
            }
        }

        String lower2 = txt.toLowerCase();

        boolean same = lower1.equals(lower2);

        System.out.println("Lowercase using charAt(): " + lower1);
        System.out.println("Lowercase using toLowerCase(): " + lower2);
        System.out.println("Are both equal? " + same);
        sc.close();
    }
    
}
