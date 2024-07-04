package SearchingAndSorting.LinearSearch;

import java.util.Arrays;

public class MaxIn2DArrayUseLinearSearch {
    public static void main(String[] args) {
        int [][] nums = {
                {23,4,1},
                {18,22,3,9},
                {78,99,34,56},
                {18,12},
        };
        System.out.println(MaxItem(nums));
    }


    public static int MaxItem(int[][] nums)
    {
        int ans = nums[0][0];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(ans<nums[i][j])
                {
                    ans = nums[i][j];
                }
            }
        }
        return ans;
    }
}
