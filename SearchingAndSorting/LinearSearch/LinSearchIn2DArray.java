package SearchingAndSorting.LinearSearch;

import java.util.Arrays;

public class LinSearchIn2DArray {
    public static void main(String[] args) {
        int [][] nums = {
                            {23,4,1},
                            {18,22,3,9},
                            {78,99,34,56},
                            {18,12},
                        };
        int target = 99;
        int[] arr = SearchArray(nums,target);
        System.out.println(Arrays.toString(arr));
        if(arr[0]==-1 && arr[1]==-1)
            System.out.println("Target Not found in the array");
        else
             System.out.println(target+" is present in array on "+arr[0]+"nd row "+arr[1]+"nd column");
    }

    public static int[] SearchArray(int[][] nums, int target)
    {
        for(int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (target == nums[i][j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
