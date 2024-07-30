class Solution {
    public int findNumberOfLIS(int[] nums) {

        if(nums.length == 1)
        return 1;
        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = 1;

        int[] count = new int[n];
        count[0] = 1;
                int max = 0;

        for(int i =1;i<n;i++)
        {
            dp[i] = 1;
            count[i] = 1;
           for(int j = 0;j<i;j++)
           {
            if(nums[i] > nums[j] && dp[i] < 1+dp[j])
            {
              
                    dp[i] = 1+dp[j];
                    count[i]=count[j];
   
            }
            else if(nums[i] > nums[j] && dp[i] == 1+dp[j])
            {
                count[i]+=count[j];
            }
           }
           max = Math.max(dp[i] , max);
           
        }

        int maxcount = 0;

        for(int i=0;i<n;i++)
        {
            if(max == dp[i])
            {
                maxcount += count[i];
            }
        }

        return maxcount;
    }
}