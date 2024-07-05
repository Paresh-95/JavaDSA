package SearchingAndSorting.BinarySearch;

import java.util.Arrays;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(Arrays.toString(letters));
        char target = 'f';
        System.out.println("Target = "+target);

        char ans = Smallest(letters,target);
        System.out.println(ans);

    }

    public static char Smallest(char[] nums,int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[start%nums.length];
    }
}
