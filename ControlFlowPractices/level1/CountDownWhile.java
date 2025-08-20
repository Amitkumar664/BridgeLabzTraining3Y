package ControlFlowPractices.level1;

import java.util.Scanner;

public class CountDownWhile {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        while (c >= 1) {
            System.out.println(c);
            c--;
        }
        sc.close();
    }
}
