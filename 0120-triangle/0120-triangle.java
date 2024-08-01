class Solution {
    public int minimumTotal(List<List<Integer>> l) {


        int m = l.size();
        int n = l.get(l.size()-1).size();
        int[][] dp = new int[m][m];

        for(int j = 0;j<m;j++)
        {
            dp[m-1][j] = l.get(m-1).get(j);
        }

        for(int i = m-2;i>=0;i--)
        {
            for(int j = i;j>=0;j--)
            {
                int t = l.get(i).get(j) + dp[i+1][j];
                int p = l.get(i).get(j) + dp[i+1][j+1];

                dp[i][j] = Math.min(t,p);
            }
        }

        return dp[0][0];
    }
}