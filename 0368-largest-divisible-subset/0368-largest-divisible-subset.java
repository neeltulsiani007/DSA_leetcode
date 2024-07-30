class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[n];
        dp[0] = 1;
        int[] hash = new int[n];
        int max = 0;
        int lastindex = 0;

        for(int i =1;i<n;i++)
        {
            dp[i] = 1;
            hash[i] = i;
            for(int j = 0;j<i;j++)
            {
                if(nums[i] % nums[j] == 0 && dp[i] < 1+dp[j])
                {
                    dp[i] = 1+dp[j];
                    hash[i] = j;
                }
                
            }
            if(max < dp[i])
                {
                    max = dp[i];
                    lastindex =i;
                }
        }
        // for(int i : dp)
        // System.out.println(i);

        l.add(nums[lastindex]);

        while(hash[lastindex] != lastindex)
        {
            lastindex = hash[lastindex];
            l.add(nums[lastindex]);

        }


return l;
    }
}