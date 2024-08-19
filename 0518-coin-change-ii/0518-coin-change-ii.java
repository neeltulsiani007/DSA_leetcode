class Solution {

    public int ans(int amount , int[] coins , int[][] memo , int ind)
    {
        if(amount == 0)
        return 1;
        if(ind == coins.length || amount <0)
        return 0;

        if(memo[ind][amount] != -1)
        return memo[ind][amount];

        int np = ans(amount ,coins , memo ,  ind+1);
        int p =0;
        if(amount >= coins[ind])
        p = ans(amount-coins[ind] ,coins , memo ,  ind);

        return memo[ind][amount] = np+p;
    }
    public int change(int amount, int[] coins) {
        
        int[][] memo = new int[coins.length+1][amount+1];

        for(int i =0;i<=coins.length;i++)
        Arrays.fill(memo[i] , -1);

        return ans(amount , coins , memo , 0);
    }
}