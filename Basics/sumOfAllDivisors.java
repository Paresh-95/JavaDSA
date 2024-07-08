package Basics;
import java.util.*;

public class sumOfAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;
        int sum = 0;
        for(int i=1;i<=N;i++)
        {
           sum = sum+i*(N/i);
        }
        System.out.println();
        System.out.println(sum);
    }
}
