import java.util.Scanner;

package 27Aug;

public class CricketScoreAnalyzer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of batsmen: ");
        int n = sc.nextInt();

        int[] runs = new int[n];

       
        System.out.println("Enter runs scored by each batsman:");
        for (int i = 0; i < n; i++) {
            runs[i] = sc.nextInt();
        }

        int highest = runs[0];
        int lowest = runs[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int score = runs[i];

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
            sum += score;
            if (score >= 100) {
                System.out.println("Century Scorer: Batsman " + (i + 1) + " scored " + score);
            }
        }

        double average = (double) sum / n;
        System.out.println("\nCricket Score Analysis");
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);

        sc.close();
    }
}
