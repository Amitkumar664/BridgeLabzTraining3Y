package ControlFlowPractices.level1;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        double n = sc.nextDouble();
        while (n != 0) {
            sum += n;
            n = sc.nextDouble();
        }
        System.out.println("Total = " + sum);
    }
}
