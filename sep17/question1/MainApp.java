package sep17.question1;

public class MainApp {
    public static void main(String[] args) {
        // Create account with account number, PIN, and initial balance
        BankAccount acc1 = new BankAccount("ACC12345", 1234, 5000);

        // Display account info
        acc1.displayAccountInfo();

        // Deposit money
        acc1.deposit(2000);
        acc1.deposit(-100); // Invalid deposit

        // Withdraw money
        acc1.withdraw(1500, 1234);  // Valid withdrawal
        acc1.withdraw(10000, 1234); // Insufficient funds
        acc1.withdraw(500, 1111);   // Wrong PIN
    }
}

