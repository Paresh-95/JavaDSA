package Function;
import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        fun(num1,num2,num3,num4);

    }

    static void fun(int ...v)
    {
        int sum = v[0]+v[1]+v[2]+v[3];
        System.out.println(sum);
        System.out.println(Arrays.toString(v));
    }
}
