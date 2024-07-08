package Basics;
import java.util.*;


public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        int ans = 0;
//        if(num<0)
//        {
//            System.out.println("number is not palindrome");
//        }
//        while(num!=0)
//        {
//            int rem = num%10;
//            ans = (ans*10)+rem;
//            num=num/10;
//        }
//        if(num==ans)
//        {
//            System.out.println("Number is Palindrome");
//        }
//        else
//        {
//            System.out.println("Number is not palindrome");
//        }
        Solution sol = new Solution();
        boolean ans = sol.isPalindrome(x);
        if(ans == true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

        //

    }
}



class Solution{
    public boolean isPalindrome(int x) {
        int ans = 0;
        int temp =x;
        while (x != 0) {
            int rem = x % 10;
            ans = (ans * 10) + rem;
            x = x / 10;
        }
        System.out.println(temp);
        System.out.println(ans);
        if(ans == temp) {
            return true;
        }
        return false;
    }

}