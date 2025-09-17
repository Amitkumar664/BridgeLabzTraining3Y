package sep17.question1;

public class BankAccount {
    // Private fields
    private final String accountNumber;
    private double balance;
    private final int pin;

    // Constructor
    public BankAccount(String accountNumber, int pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter hidden, only deposit/withdraw can update
    private void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit amount must be positive.");
            return;
        }
        setBalance(this.balance + amount);
        System.out.println("✅ Deposited: " + amount + " | New Balance: " + this.balance);
    }

    // Withdraw method
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("❌ Invalid PIN. Transaction denied.");
            return;
        }
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be positive.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("❌ Insufficient funds. Transaction denied.");
            return;
        }
        setBalance(this.balance - amount);
        System.out.println("✅ Withdrawn: " + amount + " | New Balance: " + this.balance);
    }

    // Safe account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

