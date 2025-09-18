package sep18.question1;

// Main.java

public class Main {
    public static void main(String[] args) {
        // Create Customer
        Customer c1 = new Customer(101, "Amit");

        // Create Accounts
        Account acc1 = new SavingsAccount("SAV1001", 5000, c1);
        Account acc2 = new CurrentAccount("CUR2001", 2000, c1);
        c1.addAccount(acc1);
        c1.addAccount(acc2);

        // Apply for Home Loan
        Loan loan1 = new HomeLoan(c1, 100000, 12); // 1 year
        loan1.calculateEMI();
        loan1.approveLoan();

        // Simulate EMI payments for 12 months
        for (int month = 1; month <= 12; month++) {
            System.out.println("\n--- Month " + month + " ---");
            LoanProcessor.processMonthlyEMI(loan1);
        }
    }
}

