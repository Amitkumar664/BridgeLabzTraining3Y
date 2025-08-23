package JavaString.level1;

import java.util.Scanner;

public class ArrayIndOutOfBoundsExcep {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amit", "Raj", "Kiran"};

        System.out.print("Enter an index: ");
        int idx = sc.nextInt();

        // Access invalid index → ArrayIndexOutOfBoundsException
        System.out.println("Name at index " + idx + ": " + names[idx]);
    }
}
