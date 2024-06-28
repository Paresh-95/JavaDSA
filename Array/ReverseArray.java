package Array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println("*******************");
        System.out.println("REVERSED ARRAY ");
        reverseArray(arr,0,arr.length-1);
    }

    static void reverseArray(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            end--;
            start++;
//            complete array conversion printed
//            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
