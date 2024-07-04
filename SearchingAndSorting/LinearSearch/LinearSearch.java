package SearchingAndSorting.LinearSearch;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        System.out.println(Arrays.toString(nums));
        int target = 16;
        System.out.println("TARGET = "+target);
        int ans = linearSearch(nums,target);
        if(ans==-1)
            System.out.println("Element not found");
        else
            System.out.println(target+" Found at index "+ans);
    }

    static int linearSearch(int[] arr, int target)
    {
        if(arr.length==0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

}

