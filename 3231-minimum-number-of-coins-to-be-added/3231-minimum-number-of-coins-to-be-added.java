class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);

        int cm = 0;
        int ans = 0;
        int index = 0;

        while(cm < target)
        {
            if(index < coins.length && coins[index] <= cm+1)
            {
                cm += coins[index];
                index++;
            }
            else
            {
                ans++;
                cm += cm+1;
            }
        }

        return ans;
      
    }
}