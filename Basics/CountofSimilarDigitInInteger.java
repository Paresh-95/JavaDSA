import java.util.Scanner;
public class CountofSimilarDigitInInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number  = ");
        int Int = sc.nextInt();
        System.out.println("Enter the number to find = ");
        int num = sc.nextInt();
        int count = 0;
        while(Int>0)
        {
           int rem = Int%10;
           if(rem==num)
           {
               count++;
           }
            Int = Int/10;
        }
        System.out.println(count);
    }
}
