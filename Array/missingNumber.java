package Array;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {

        int[] nums = {3,0,1};
        int ans = 0;
        System.out.println(Arrays.toString(nums));
        int [] count = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]] = nums[i];
        }
        System.out.println(Arrays.toString(count));
        for(int i=1;i<nums.length;i++) {
            if (count[i] == 0) {
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}
