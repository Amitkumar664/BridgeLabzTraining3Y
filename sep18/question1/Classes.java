package sep18.question1;

// BankingSystem.java

import java.util.*;

// Abstract Account Class
abstract class Account {
    protected final String accountNumber; // immutable
    protected double balance;
    protected Customer owner;

    public Account(String accountNumber, double balance, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into " + accountNumber);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + accountNumber);
            return true;
        } else {
            System.out.println("Insufficient balance in " + accountNumber);
            return false;
        }
    }
}

// Subclasses
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance, Customer owner) {
        super(accountNumber, balance, owner);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance, Customer owner) {
        super(accountNumber, balance, owner);
    }
}

// Customer holds multiple accounts (Aggregation)
class Customer {
    private int customerId;
    private String name;
    private List<Account> accounts = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public List<Loan> getLoans() {
        return loans;
    }
}

// Repayment Schedule (Composition)
class RepaymentSchedule {
    private int tenureMonths;
    private double monthlyEMI;

    public RepaymentSchedule(int tenureMonths, double monthlyEMI) {
        this.tenureMonths = tenureMonths;
        this.monthlyEMI = monthlyEMI;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    public double getMonthlyEMI() {
        return monthlyEMI;
    }

    public void reduceTenure() {
        if (tenureMonths > 0) {
            tenureMonths--;
        }
    }
}

// Interface
interface LoanOperations {
    void approveLoan();
    void calculateEMI();
    void closeLoan();
}

// Loan (Association with Customer)
abstract class Loan implements LoanOperations {
    protected Customer customer;
    protected double principal;
    protected int tenureMonths;
    protected RepaymentSchedule repaymentSchedule;
    protected boolean isActive;

    // Static: Interest rate policy (applies to all loans)
    protected static double baseInterestRate = 8.0;

    public Loan(Customer customer, double principal, int tenureMonths) {
        this.customer = customer;
        this.principal = principal;
        this.tenureMonths = tenureMonths;
        this.isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    public RepaymentSchedule getRepaymentSchedule() {
        return repaymentSchedule;
    }

    @Override
    public void approveLoan() {
        isActive = true;
        customer.addLoan(this);
        System.out.println("Loan approved for " + customer.getName() + " of amount " + principal);
    }

    @Override
    public void closeLoan() {
        isActive = false;
        System.out.println("Loan closed for " + customer.getName());
    }
}

// Polymorphism: Different Loan Types
class HomeLoan extends Loan {
    public HomeLoan(Customer c, double principal, int tenureMonths) {
        super(c, principal, tenureMonths);
    }

    @Override
    public void calculateEMI() {
        double r = (baseInterestRate / 100) / 12;
        double emi = (principal * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
        repaymentSchedule = new RepaymentSchedule(tenureMonths, emi);
    }
}

class CarLoan extends Loan {
    public CarLoan(Customer c, double principal, int tenureMonths) {
        super(c, principal, tenureMonths);
    }

    @Override
    public void calculateEMI() {
        double r = ((baseInterestRate + 1.5) / 100) / 12;
        double emi = (principal * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
        repaymentSchedule = new RepaymentSchedule(tenureMonths, emi);
    }
}

class PersonalLoan extends Loan {
    public PersonalLoan(Customer c, double principal, int tenureMonths) {
        super(c, principal, tenureMonths);
    }

    @Override
    public void calculateEMI() {
        double r = ((baseInterestRate + 3.0) / 100) / 12;
        double emi = (principal * r * Math.pow(1 + r, tenureMonths)) / (Math.pow(1 + r, tenureMonths) - 1);
        repaymentSchedule = new RepaymentSchedule(tenureMonths, emi);
    }
}

// EMI Auto-Debit Simulator
class LoanProcessor {
    public static void processMonthlyEMI(Loan loan) {
        if (!loan.isActive()) {
            System.out.println("Loan not active.");
            return;
        }

        double emi = loan.getRepaymentSchedule().getMonthlyEMI();
        boolean deducted = false;

        // Try to auto-debit from any account
        for (Account acc : loan.customer.getAccounts()) {
            if (acc.withdraw(emi)) {
                System.out.println("EMI of " + emi + " debited from account " + acc.getAccountNumber());
                deducted = true;
                break;
            }
        }

        if (!deducted) {
            System.out.println("Auto-debit failed! Insufficient balance in all accounts for " + loan.customer.getName());
        } else {
            loan.getRepaymentSchedule().reduceTenure();
            if (loan.getRepaymentSchedule().getTenureMonths() == 0) {
                loan.closeLoan();
            }
        }
    }
}
