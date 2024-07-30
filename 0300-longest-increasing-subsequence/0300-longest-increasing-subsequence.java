class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int dp[] = new int[nums.length];

        dp[0] = 1;

        for(int i =1;i<nums.length;i++)
        {
            dp[i] = 1;
            for(int j =0;j<nums.length;j++)
            {
                if(nums[i] > nums[j])
                dp[i] = Math.max(dp[i] , 1+dp[j]);
            }
        }

        int max = dp[0];

        for(int i : dp)
        max = Math.max(i , max);

        return max;
    }
}