// package aug28;

import java.util.*;

public class OnlineShoppingCartSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Online Shopping Cart");
        boolean keepRunning = true;

        do {
            int bill = 0;
            int discountedBill = 0;
            System.out.println("Enter no of items you want to buy:");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Item List");
                System.out.println("1. Mobile  | cost is 10000");
                System.out.println("2. Ball    | cost is 50");
                System.out.println("3. Bat     | cost is 20");
                System.out.println("4. Cap     | cost is 200");
                System.out.println("Enter your Item no:");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        bill += 10000;
                        break;
                    case 2:
                        bill += 50;
                        break;
                    case 3:
                        bill += 20;
                        break;
                    case 4:
                        bill += 200;
                        break;
                    default:
                        System.out.println("Invalid choice, defaulting to Cap");
                        bill += 200;
                }
            }

            if (bill > 5000) {
                discountedBill = (int) (bill * 0.8);
                System.out.println("Your discounted bill is " + discountedBill);
            } else {
                System.out.println("No discount applied. Your bill is " + bill);
            }

            System.out.print("\nDo you want to do more shopping ? (yes/no): ");
            String cont = sc.next();
            if (cont.equalsIgnoreCase("no")) {
                keepRunning = false;
            }
        } while (keepRunning);

        sc.close();
    }
}
