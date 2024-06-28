package First;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+ = addition \n - = substraction\n * = multiplication \n / = division \n % = division");
        int out = 0;
        while(true)
        {
            System.out.println("Enter the operator = ");
            char operator = sc.next().trim().charAt(0);
            if(operator == '+' || operator =='-' || operator == '*' || operator=='/' || operator=='%'){
                System.out.println("Enter num1 = ");
                int num1 = sc.nextInt();
                System.out.println("Enter num2 = ");
                int num2 = sc.nextInt();
                if(operator=='+'){
                    out = num1+num2;
                }
                if(operator=='+'){
                    out = num1+num2;
                }
                if(operator=='-'){
                    out = num1-num2;
                }
                if(operator=='*'){
                    out = num1*num2;
                }
                if(operator=='/'){
                    if(num2!=0)
                    {
                        out = num1/num2;
                    }
                    else {
                        System.out.println("Cannot divide by 0");
                    }
                }
                if(operator=='%') {
                    out = num1 % num2;
                }

            }
            else if(operator=='x'||operator=='X')
            {
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
            System.out.println("Output of your operator of "+operator+" is "+out);
        }

    }
}
