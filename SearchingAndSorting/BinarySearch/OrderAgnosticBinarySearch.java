package SearchingAndSorting.BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {99,80,75,22,11,10,5,2,-3};
        System.out.println(Arrays.toString(nums));
        int target = -3;
        System.out.println("Target = " + target);
        System.out.println(target + " found at index " + OrderAgnosticBS(nums, target));
    }

    public static int OrderAgnosticBS(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        boolean isAscending = nums[start]<nums[end];

        if(isAscending) System.out.println("Array is Ascending");
        else System.out.println("Array is Descending");


        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(isAscending)
            {
                if(target<nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>nums[mid]) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }



}

