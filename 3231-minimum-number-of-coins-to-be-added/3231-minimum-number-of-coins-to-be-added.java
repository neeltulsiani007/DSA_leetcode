class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);

        int cs = 0;
        int nas = 0;
        int i =0;

        while(cs < target)
        {
            if(i<(coins.length) && coins[i] <= (cs+1))
            {
                cs+=coins[i];
                i++;
            }
            else
            {
                nas++;
                cs+=cs+1;
            }
        }
        return nas;
    }
}