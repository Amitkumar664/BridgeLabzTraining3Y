package Sep11;

public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. Remaining Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }

    @Override
    public double calculateInterest() {
        // Current accounts usually don’t earn interest
        return 0;
    }
}

