package Array;


import java.util.Arrays;

public class SwapValueArray {

    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};

        System.out.println("BEFORE SWAPPING");
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");
        swap(arr,1,3);

    }

    static void swap(int[] arr,int index1,int index2)
    {
        //implement simple swap function
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
        System.out.println("AFTER SWAPPING");
        System.out.println(Arrays.toString(arr));
    }


}
