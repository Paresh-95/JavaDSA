package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        int [] arr = new int[2*n];
        for(int i=0;i<n;i++)
        {
            arr[i*2] = nums[i];
            arr[i*2+1] = nums[i+n];
        }

        System.out.println(Arrays.toString(arr));



    }
}
