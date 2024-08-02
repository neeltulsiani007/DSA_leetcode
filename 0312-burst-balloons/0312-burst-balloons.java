class Solution {

    public int ans(int[] nums , int i , int j , int[][] dp)
    {
        if(i>j)
        return 0;

        if(dp[i][j] != -1)
        return dp[i][j];

        int max = Integer.MIN_VALUE;

        for(int k = i;k<=j;k++)
        {
            int ans = nums[k]*(i-1<0?1:nums[i-1])*(j+1>=nums.length?1:nums[j+1]) + ans(nums,i , k-1,dp) + ans(nums , k+1,j,dp);
            max = Math.max(ans , max);
        }

        return dp[i][j] = max;
    }
    public int maxCoins(int[] nums) {

 
         int[][] dp = new int[nums.length][nums.length];
         for(int i =0;i<nums.length;i++)
        {
            Arrays.fill(dp[i] , -1);
        }

      
        return ans(nums, 0 , nums.length-1 ,dp);
    }
}