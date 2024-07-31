class Solution {
    public int maxProfit(int[] prices) {
        
        int[][][] dp = new int[prices.length+1][2][3];

        int profit = 0;

        for(int i = prices.length-1;i>=0;i--)
        {
            for(int buy = 0;buy<=1;buy++)
            {
                for(int limit = 1;limit<=2;limit++)
                {
                    if(buy ==1)
                    {
                        profit = Math.max(0+dp[i+1][1][limit], -prices[i]+ dp[i+1][0][limit]);
                    }
                    if(buy ==0){
                        profit = Math.max(0+dp[i+1][0][limit],prices[i]+dp[i+1][1][limit-1]);
                    }
                    dp[i][buy][limit] = profit;
                }
            }
        }


      return dp[0][1][2];
    }
}