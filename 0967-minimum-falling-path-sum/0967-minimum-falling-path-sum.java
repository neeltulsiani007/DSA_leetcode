class Solution {
    public int minFallingPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

             for(int j = 0;j<n;j++)
             dp[0][j] = grid[0][j];

        for(int i =1;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
               

                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                int up = Integer.MAX_VALUE;

                if(j-1 >=0)
                left = grid[i][j] + dp[i-1][j-1];
                if(j+1<n)
                {
                    right = grid[i][j] + dp[i-1][j+1];
                }
                up = grid[i][j] + dp[i-1][j];

                dp[i][j] = Math.min(up ,   Math.min(left , right));

            }
        }
    int min = Integer.MAX_VALUE;
        for(int j =0 ;j<n;j++)
        {
            min = Math.min(dp[n-1][j] , min);
        }
        return min;
    }
}