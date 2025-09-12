package sep11;

public class BankMain {
  public static void main(String[] args) {
        Account savings = new SavingsAccount(101, "Amit", 5000);
        Account current = new CurrentAccount(102, "Ravi", 10000);

        savings.deposit(2000);
        savings.withdraw(2500);
        System.out.println("Savings Interest: " + savings.calculateInterest());

        System.out.println();

        current.deposit(5000);
        current.withdraw(14000);
        System.out.println("Current Interest: " + current.calculateInterest());
    }
}
