package SearchingAndSorting.BinarySearch;

import java.util.Arrays;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(Arrays.toString(nums));
        System.out.println("Target= "+target);
        int ans = Floor(nums,target);
        System.out.println("index = "+ans);
        System.out.println("Number = "+nums[ans]);
    }

    public static int Floor(int[] nums,int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(target==nums[mid])
            {
                return mid;
            }

            if(target<nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }

}
