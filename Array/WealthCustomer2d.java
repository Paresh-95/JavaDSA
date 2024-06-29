package Array;

public class WealthCustomer2d {
    public static void main(String[] args) {
       int[][] accounts = {{1,2,3},{1,2,3}};

        int val  = Integer.MIN_VALUE;
        int ans;
        for(int i=0;i<accounts.length;i++)
        {
            ans = 0;
            for(int j=0;j<accounts[0].length;j++)
            {
                ans = ans+accounts[i][j];
            }
            val  = Math.max(ans,val);
        }
        System.out.println(val);
    }
}
