package SearchingAndSorting.BinarySearch;

public class InfiniteArrayBinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    public static int ans(int arr[],int target){
      int start = 0;
      int end = 1;

      while(target<arr[end])
      {
          int newStart = start;
          end = end+(end-start)*2;
          start = newStart;
      }
      return binary(arr,target,start,end);
    }

    public static int binary(int[] nums, int target,int start,int end)
    {

        while(start<=end)
        {
//            int mid = (start+end)/2;
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
