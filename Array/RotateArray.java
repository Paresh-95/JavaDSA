package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        int k = 3;
        k=k%nums.length;
        Reverse(nums,0,nums.length-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void Reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
