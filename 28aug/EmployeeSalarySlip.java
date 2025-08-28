package 28Aug;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        System.out.println("Employee salary sleep System");
        String[] names = {"Amit", "A", "B", "C"};
        int[] basicSalary = {30000, 55000, 45000, 60000};

         
        for (int i = 0; i < names.length; i++) {
            double hra = basicSalary[i] * 0.20; 
            double da = basicSalary[i] * 0.10;  
            double netSalary = basicSalary[i] + hra + da;

            
            double tax = 0;
            if (netSalary > 50000) {
                tax = netSalary * 0.10;
                netSalary = netSalary - tax;
            }

            System.out.println("Salary slip of "+names[i]+" is : ");
            System.out.println("hra is "+hra);
            System.out.println("da is "+ da);
            System.out.println("net salary is "+netSalary);


        }    

    }
  
    
    
}
