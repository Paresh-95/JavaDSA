package Array;

import java.util.Arrays;

public class RunningSum1DArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] sumArr = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            sumArr[i] = sum;
        }
        System.out.println(Arrays.toString(sumArr));
    }
}
