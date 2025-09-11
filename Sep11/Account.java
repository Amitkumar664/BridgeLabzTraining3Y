package Sep11;


public abstract class Account {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double calculateInterest();

    // Common method
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

