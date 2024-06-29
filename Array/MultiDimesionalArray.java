package Array;
import java.util.*;


public class MultiDimesionalArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int [][] arr = new int[3][3];

        // direct intialization
//        int [][] arr1 = {
//                        {1,2,3},
//                        {4,5},
//                        {6,7,8,9}
//        };

        System.out.println(arr.length);

        for(int row =0;row<arr.length;row++)
        {
            //for each column in every row
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col] = sc.nextInt();
            }
        }

//
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }







    }
}


