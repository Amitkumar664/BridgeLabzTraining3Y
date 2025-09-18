package sep18.question2;

// Main.java
public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Amit");

        // Prepaid plan
        PrepaidPlan prepaid = new PrepaidPlan("9876543210", 200);
        prepaid.usage = new Plan.UsageDetails(50, 20, 500); // calls, sms, MB
        cust.addPlan(prepaid);

        // Postpaid plan
        PostpaidPlan postpaid = new PostpaidPlan("9123456780", 1000);
        postpaid.usage = new Plan.UsageDetails(100, 50, 1000);
        cust.addPlan(postpaid);

        // Use inner class DataPack
        Plan.DataPack pack = postpaid.new DataPack(200, 50);
        pack.activate();

        // Bill generation
        BillGenerator.generateMonthlyBill(cust);

        // Checking balances
        prepaid.checkBalance();
        postpaid.checkBalance();
    }
}
