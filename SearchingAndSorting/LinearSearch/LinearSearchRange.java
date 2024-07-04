package SearchingAndSorting.LinearSearch;

import java.util.Arrays;

public class LinearSearchRange {

    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        System.out.println(Arrays.toString(nums));
        int target = -11;
        int start = 1;
        int end = 4;
        System.out.println("TARGET = "+target);
        int ans = LinearSearchInRange(nums,target,start,end);
        if(ans==-1)
            System.out.println("Element not Found");
        else
            System.out.println(target+" Element found at "+ans);

    }

    static int LinearSearchInRange(int[] nums,int target,int start,int end)
    {
        if(nums.length==0)
        {
            return -1;
        }

        for(int i=start;i<end;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}
