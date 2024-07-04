package SearchingAndSorting.BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println(Arrays.toString(nums));
        int target = 9;
        System.out.println("Target = " + target);
        System.out.println(target + " found at index " + binary(nums, target));
    }

    public static int binary(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;

        while(start<=end)
        {
//            int mid = (start+end)/2;
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
