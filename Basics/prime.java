package Basics;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        double sqrtN = Math.sqrt(N);
        for(int i=1;i*i<=sqrtN;i++)
        {
            if(N%i==0){
                count++;
            }
        }

        if(count==2)
        {
            System.out.println("Prime");
        }
        else
            System.out.println("Not Prime");
    }
}
