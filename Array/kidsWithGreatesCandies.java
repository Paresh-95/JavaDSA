package Array;
import java.util.*;

public class kidsWithGreatesCandies {
    public static void main(String[] args) {


            int candies[] = {2,3,5,1,3};
            int extraCandies = 3;
            ArrayList<Boolean> ans = new ArrayList<Boolean>(candies.length);
            int largest = 0;
            for(int i=0;i<candies.length;i++)
            {
                if(candies[i]>largest)
                {
                    largest = candies[i];
                }
            }
            for(int i =0;i<candies.length;i++)
            {
                if((candies[i]+extraCandies)>=largest)
                {
                    ans.add(true);
                }
                else
                    ans.add(false);
            }
        System.out.println(ans);


    }
}