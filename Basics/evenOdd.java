package Basics;
import java.util.*;

public class evenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wheather given number is even or odd");
        System.out.println("Enter the number = ");
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println(num+" is Even Number");
        }
        else {
            System.out.println(num+" is Odd Number");
        }

    }

}
