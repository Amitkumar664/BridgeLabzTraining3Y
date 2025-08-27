import java.util.Scanner;

public class FitnessCenterMembershipSystem {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keepRunning = true; 

        do {
            System.out.print("Enter number of members to register: ");
            int n = sc.nextInt();

            
            for (int i = 1; i <= n; i++) {
                System.out.println("\nRegistering Member " + i + " ");
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly");
                System.out.println("2. Quarterly");
                System.out.println("3. Yearly ");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                int fee = 0;
                switch (choice) {
                    case 1:
                        fee = 1000;
                        break;
                    case 2:
                        fee = 2700;
                        break;
                    case 3:
                        fee = 10000;
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Monthly.");
                        fee = 1000;
                }

                System.out.print("Are you a Student or Senior Citizen? (yes/no): ");
                String discountInput = sc.next();
                if (discountInput.equalsIgnoreCase("yes")) {
                    fee = (int)(fee * 0.8); // 20% discount
                    System.out.println("Discount Applied! New Fee: ₹" + fee);
                } else {
                    System.out.println("No Discount. Fee: ₹" + fee);
                }

                System.out.println("Member " + i + " Registered. Final Fee: ₹" + fee);
            }

            
            System.out.print("\nDo you want to register more members? (yes/no): ");
            String cont = sc.next();
            if (!cont.equalsIgnoreCase("yes")) {
                keepRunning = false;
            }
    
        } while (keepRunning);

        System.out.println("\nGym Closed. No more registrations.");
        sc.close();
    }
    
}
