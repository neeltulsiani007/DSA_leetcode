class Solution {
    public int lengthOfLIS(int[] a) {
         int[] dp = new int[a.length];
        dp[0] = 1;
        
        for(int i =1;i<a.length;i++)
        {
            dp[i] = 1;
            for(int j = 0;j<i;j++)
            {
                if(a[i]>a[j])
                dp[i] = Math.max(dp[i] , dp[j]+1);
            }
        }
        
        int max = dp[0];
        for(int i : dp)
        max = Math.max(i,max);
        
        return max;
    }
    }
