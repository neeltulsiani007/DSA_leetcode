class Solution {
    public int maxProfit(int[] prices) {
        
   int temp =0;
        int max = 0;
        int currbought = prices[0];

        for(int i = 1 ;i<prices.length;i++)
        {
            temp = 0;
            if(prices[i] < currbought)
            {
                currbought = prices[i];
            }
            else
            {
                temp = prices[i] - currbought;
            }
            max = Math.max(temp , max);
        }

        return max;

    
    }
}