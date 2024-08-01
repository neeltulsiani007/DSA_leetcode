class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        
        int[][] dp = new int[o.length][o[0].length];
        int m = o.length;
        int n = o[0].length;
        if(o[m-1][n-1] == 1 || o[0][0] == 1)
        return 0;


        for(int i =0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(o[i][j] == 1)
                dp[i][j] = 0;
                else if(i== 0 && j== 0)
                dp[i][j]= 1;
                else
                {
                    int up = 0;
                    int left = 0;
                    if(i>0)
                    up = dp[i-1][j];
                    if(j>0)
                    left = dp[i][j-1];

                    dp[i][j] = up+left ; 
                } 
            }
        }
        return dp[o.length-1][o[0].length-1];
    }
}