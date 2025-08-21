package JavaString.level1;

import java.util.Scanner;

public class StringIndexExcep {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String txt = sc.next();

        int index = txt.length(); // invalid index

        if (index >= 0 && index < txt.length()) {
            System.out.println("Character: " + txt.charAt(index));
        } else {
            System.out.println("Invalid index " + index + ". Valid range: 0 to " + (txt.length() - 1));
        }

        sc.close();
    }
}
