class Solution {
    public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                int up = Integer.MAX_VALUE;;
                int left = Integer.MAX_VALUE;;
                if(i == 0 && j== 0)
                {
                    dp[i][j] = grid[0][0];
                    continue;
                }
                if(i>0)
                up =  grid[i][j] + dp[i-1][j];
                if(j>0)
                left = grid[i][j] + dp[i][j-1];
                dp[i][j] = Math.min(up,left);
            }
        }
              return dp[m-1][n-1];  

    }
}