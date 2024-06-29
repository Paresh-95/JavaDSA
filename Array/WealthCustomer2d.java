package Array;

import java.util.Arrays;

public class WealthCustomer2d {
    public static void main(String[] args) {
        int[][] acc = {{1, 2, 3}, {3, 2, 1}};
        int val = Integer.MIN_VALUE;
        int sum;
        for(int i=0;i<acc.length;i++)
        {
            sum=0;
            for(int j=0;j<acc[0].length;j++)
            {
                sum = sum+acc[i][j];
            }
            val = Math.max(sum,val);
        }
        System.out.println(val);
    }
}
