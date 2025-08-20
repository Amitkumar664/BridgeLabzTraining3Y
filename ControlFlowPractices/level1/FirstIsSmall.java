package ControlFlowPractices.level1;

import java.util.Scanner;

public class FirstIsSmall  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd num: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("First num is smallest");
        } else {
            System.out.println("First num is not smallest");
        }

        sc.close();
    }
}
