package sep18.question2;

// TelecomSystem.java
import java.util.*;

// Abstract Plan
abstract class Plan {
    protected final String mobileNumber;  // immutable
    protected UsageDetails usage;
    protected static double networkTax = 5.0; // common tax %

    public Plan(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.usage = new UsageDetails(0, 0, 0);
    }

    public String getMobileNumber() { return mobileNumber; }
    public abstract void recharge(double amount);
    public abstract void checkBalance();
    public abstract double calculateBill();

    // Composition: UsageDetails
    static class UsageDetails {
        int calls; int sms; double data; // MB
        UsageDetails(int calls, int sms, double data) {
            this.calls = calls; this.sms = sms; this.data = data;
        }
    }

    // Inner Class: DataPack
    class DataPack {
        private double dataMB; private double price;
        DataPack(double d, double p){ dataMB=d; price=p; }
        public void activate(){ usage.data += dataMB;
            System.out.println("Activated "+dataMB+"MB for "+price+" Rs"); }
    }
}

// Interface
interface Rechargeable {
    void recharge(double amount);
    void checkBalance();
}

// Prepaid Plan
class PrepaidPlan extends Plan implements Rechargeable {
    private double balance;

    public PrepaidPlan(String number, double initialBalance) {
        super(number); this.balance = initialBalance;
    }

    @Override
    public void recharge(double amount) {
        balance += amount;
        System.out.println("Recharged "+amount+". Balance="+balance);
    }

    @Override
    public void checkBalance() { System.out.println("Balance="+balance); }

    @Override
    public double calculateBill() {
        double cost = usage.calls*1 + usage.sms*0.5 + usage.data*0.1;
        double tax = cost * networkTax/100;
        if(balance >= cost+tax) {
            balance -= (cost+tax);
            return cost+tax;
        } else {
            System.out.println("Low balance for "+mobileNumber);
            return 0;
        }
    }
}

// Postpaid Plan
class PostpaidPlan extends Plan implements Rechargeable {
    private double monthlyLimit; private double due;

    public PostpaidPlan(String number, double monthlyLimit) {
        super(number); this.monthlyLimit = monthlyLimit;
    }

    @Override
    public void recharge(double amount) {
        due -= amount;
        System.out.println("Paid "+amount+". Remaining due="+Math.max(0,due));
    }

    @Override
    public void checkBalance() {
        System.out.println("Credit Limit="+monthlyLimit+", Due="+due);
    }

    @Override
    public double calculateBill() {
        double cost = usage.calls*1.2 + usage.sms*0.75 + usage.data*0.15;
        double tax = cost * networkTax/100;
        due += cost+tax;
        return cost+tax;
    }
}

// Customer has multiple plans (Aggregation)
class Customer {
    private String name;
    private List<Plan> plans = new ArrayList<>();
    public Customer(String name){this.name=name;}
    public void addPlan(Plan p){plans.add(p);}
    public List<Plan> getPlans(){return plans;}
    public String getName(){return name;}
}

// Bill Generator
class BillGenerator {
    public static void generateMonthlyBill(Customer c) {
        System.out.println("\n--- Monthly Bill for "+c.getName()+" ---");
        for(Plan p : c.getPlans()) {
            double bill = p.calculateBill();
            System.out.println("Mobile: "+p.getMobileNumber()+" | Bill: "+bill);
        }
    }
}

