package Sep11;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) { // Minimum balance requirement
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. Remaining Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of 1000 must be maintained.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

