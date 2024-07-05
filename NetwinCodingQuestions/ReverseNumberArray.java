package NetwinCodingQuestions;

import Array.ReverseArray;

import java.util.Arrays;

public class ReverseNumberArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = nums.length -1;
        System.out.println(Arrays.toString(nums));

        ReverseArray(nums,start,end);


    }

    public static void ReverseArray(int[] nums, int start , int end)
    {
        while(start<end)
        {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));

    }



}