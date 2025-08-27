
import java.util.*;

public class AtmTransaction {
    public static int balance(int[] nums) {
        int total=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] > 0) {
                total+=nums[i];
            }
            else{
                total+=nums[i];
            }
        }
        return total;
    }
    public static void withDepo(int arr[]){
        for(int i=0;i<arr.length;i++){
            // arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM online Transaction");
        System.out.println("Enter your no of transactons");
        int n=sc.nextInt();
        System.out.println("Enter your money you have deposit or withdrawl(-ve)");
        int arr[]=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        withDepo(arr);
        
        int k=balance(arr);
        if(k<0){
            System.out.println("OverDraft");
        }
        else{
            System.out.println("Your final balance is" + k);
        }
       

    }
    
}

