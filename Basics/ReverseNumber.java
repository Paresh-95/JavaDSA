import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        int count = 0;
        int out = 0;
        while(num>0)
        {
            int rem = num%10;
            out = out*10+rem;
            num = num/10;
            count++;

        }
        System.out.println(out);
    }

}
