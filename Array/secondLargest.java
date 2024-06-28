package Array;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr= {12,35,1,10,34,1};
        int n=6;
        int largest =arr[0];
        int secondLargest = -1;
        for(int i=0;i<n;i++)
        {
            if(largest<=arr[i])
            {
                largest = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>secondLargest && arr[i]!=largest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
