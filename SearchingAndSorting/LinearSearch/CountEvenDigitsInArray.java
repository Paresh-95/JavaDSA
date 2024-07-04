package SearchingAndSorting.LinearSearch;

public class CountEvenDigitsInArray {
    public static void main(String[] args) {
        int[] nums = {1,111,9,1764,98,1};
        int ans = CountEvenDigitsArray(nums);
        System.out.println("Count = "+ans);

    }

    public static int CountEvenDigitsArray(int[] nums)
    {
        int count = 0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num)
    {
        //traditional approach
//        int count=0;
//        while(num!=0)
//        {
//            num=num/10;
//            count++;
//        }
//        return count % 2 == 0;

        //String approach
        String str = "" + num;
//        String str = Integer.toString(num);     //another method to convert to String
        int count = str.length();
        return count%2==0;
    }
}
