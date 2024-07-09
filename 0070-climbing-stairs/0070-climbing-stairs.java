class Solution {

    public int fun(int n , int[] memo)
    {
        if(memo[n] == -1)
        {
            int res;
            if(n == 1 || n==2)
            res = n;
            else
            res = fun(n-1 , memo)+fun(n-2,memo);

            memo[n] = res;
        }
        return memo[n];
    }
    public int climbStairs(int n) {
        
        int[] memo = new int[n+1];
        Arrays.fill(memo , -1);
        return fun(n , memo);

    }
}