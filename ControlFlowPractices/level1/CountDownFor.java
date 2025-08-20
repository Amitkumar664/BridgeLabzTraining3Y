package ControlFlowPractices.level1;

import java.util.Scanner;

public class CountDownFor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = c; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
    
}
