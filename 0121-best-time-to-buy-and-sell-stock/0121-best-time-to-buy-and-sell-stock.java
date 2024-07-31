class Solution {
    public int maxProfit(int[] prices) {
        
        int[] dp = new int[prices.length+1];
        dp[0] = 0;
        int max = 0;
        int currbought = prices[0];

        for(int i = 1 ;i<prices.length;i++)
        {
            if(prices[i] < currbought)
            {
                currbought = prices[i];
                dp[i] = 0;
            }
            else
            {
                dp[i] = prices[i] - currbought;
            }
            max = Math.max(dp[i] , max);
        }

        return max;

    
    }
}