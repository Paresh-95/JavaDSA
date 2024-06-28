package Array;

import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {

        int[] arr = {1,21,54,108,203,2,5,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("MAX VALUE IN ARRAY");
        System.out.println(MaxOfArray(arr));
        System.out.println("************************");
        System.out.println("MAX VALUE IN RANGE");
        System.out.println((MaxOfArrayInRange(arr,0,3)));
    }


    static int MaxOfArray(int[] arr)
    {
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    static int MaxOfArrayInRange(int[] arr,int start, int end)
    {
        int max = arr[0];
        for(int i=start;i<end;i++)
        {
            if(arr[i]>=max)
            {
                max = arr[i];
            }
        }
        return max;
    }



}
