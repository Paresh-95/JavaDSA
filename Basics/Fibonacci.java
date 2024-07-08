package Basics;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index till which series should print = ");
        int n = sc.nextInt();
        System.out.println("\n************");
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n)
        {
            int temp = b;
            b=b+a;
            a=temp;
            count++;
            System.out.println(b);
        }
    }
}
