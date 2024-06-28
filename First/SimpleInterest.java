package First;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prinicpal amount = ");
        float priciple = sc.nextFloat();
        System.out.println("Enter the Interest Rate = ");
        float interestRate = sc.nextFloat();
        System.out.println("Enter the time in Year = ");
        int time = sc.nextInt();

        float prinicpleAmount = (priciple*interestRate*time)/100;
        System.out.println("Simple Interest Calculated is "+prinicpleAmount);
        System.out.println("Total Amount to Pay with Interest is "+(prinicpleAmount+priciple));
    }
}
