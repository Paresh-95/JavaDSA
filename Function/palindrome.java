package Function;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reverseStr = "";
        System.out.println("Enter the String = ");
        String str = sc.next();
        int strLength = str.length();
        System.out.println(strLength);

        for(int i = (strLength-1); i>=0 ; i-- )
        {
            reverseStr = reverseStr + str.charAt(i);
        }

        System.out.println("Reverse String = "+reverseStr);
        if(str.toLowerCase().equals(reverseStr.toLowerCase()))
        {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }

}
