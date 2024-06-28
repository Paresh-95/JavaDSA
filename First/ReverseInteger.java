package First;
import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int temp = num;
//        int out = 0;
//        while(temp!=0)
//        {
//            int rem = temp%10;
//            out= out*10+rem;
//            temp=temp/10;
//
//        }
//
//        System.out.println(out);



//Other Method


        int ans = 0;
        while(num!=0)
        {
            int digit = num%10;

            if(ans > Integer. MAX_VALUE/10 || ans < Integer.MIN_VALUE){
                System.out.println(0);
            }
            ans = (ans*10)+digit;
            num=num/10;
        }
        System.out.println(ans);



    }
    }

