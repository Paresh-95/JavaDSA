package Function;

import java.util.Scanner;

public class swapNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 = ");
        int num2 = sc.nextInt();
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        //swap the number
        Swap(num1,num2);


    }

    static void Swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        Print(num1,num2);
    }

    static void Print(int num1,int num2){
        System.out.println("****************");
        System.out.println("After Swaping");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
