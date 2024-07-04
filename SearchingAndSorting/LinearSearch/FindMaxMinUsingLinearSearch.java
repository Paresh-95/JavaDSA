package SearchingAndSorting.LinearSearch;

import java.util.Arrays;

public class FindMaxMinUsingLinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        System.out.println(Arrays.toString(nums));
        int min = min(nums);
        System.out.println("Minimun Number is "+min);

    }

    public static int min(int[] nums)
   {
       int ans = nums[0];

       for(int num:nums)
       {
           if(ans>num) {
               ans = num;
           }
       }
       return ans;
   }

}
