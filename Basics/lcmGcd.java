package Basics;
import java.util.*;

public class lcmGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
//        Long gcd = 1L;
//        Long lcm = 1L;
//        Long min = Math.min(A, B);
//        for (Long i = min; i >= 1; i--) {
//            if (A % i == 0 && B % i == 0) {
//                gcd = i;
//                break;
//            }
//        }
//        lcm = ((A * B) / gcd);
//        System.out.println(lcm + " " + gcd);
        Long Num1 = A;
        Long Num2 = B;
        Long gcd = 1L;
        Long lcm = 1L;
        while(A>0 && B>0){
            if(A>B){
                A = A%B;
            }
            else{
                B=B%A;
            }
            if(A==0)
            {
                 gcd = B;
            }
            else
                 gcd = A;
            lcm = (Num1*Num2)/gcd;
        }
        System.out.println(lcm+" "+gcd);
    }
}
