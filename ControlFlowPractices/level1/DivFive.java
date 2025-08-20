package ControlFlowPractices.level1;

import java.util.*;

public class DivFive {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = sc.nextInt();

        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is not divisible by 5");
        }
        sc.close();
    }    
}
