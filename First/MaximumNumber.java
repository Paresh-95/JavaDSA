import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1= ");
        int num1 = input.nextInt();
        System.out.print("Enter num2= ");
        int num2 = input.nextInt();
        System.out.print("Enter num3= ");
        int num3 = input.nextInt();
//         Method 1
//        int max = num1;
//        if(num2>max)
//        {
//            max= num2;
//        }
//        if(num3>max)
//        {
//            max =num3;
//        }


        //Method 2
//        int max = 0;
//        if(num1>num3)
//        {
//            max =num1;
//        }
//        else{
//            max = num2;
//        }
//        if(num3>max)
//        {
//            max = num3;
//        }

        //Method 3

        int max = Math.max(num1,Math.max(num2,num3));

        System.out.println("Max number is "+max);

    }
}
