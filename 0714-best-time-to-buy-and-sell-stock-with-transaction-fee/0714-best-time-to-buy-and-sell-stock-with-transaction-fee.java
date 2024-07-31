class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length+1][2];
        int profit = 0;

        for(int i = prices.length-1;i>=0;i--)
        {
            for(int buy=0;buy<=1;buy++)
            {
                if(buy == 1)
                profit = Math.max(-prices[i] + dp[i+1][0] , 0 + dp[i+1][1]);
                else
                {
                profit = Math.max(prices[i] + dp[i+1][1] - fee , 0 + dp[i+1][0]);
                }
                
                dp[i][buy] = profit;
            }   
        }

        return dp[0][1];
    }
}