class Solution {

    public int ans(int[] nums , int ind , int[] memo, int n)
    {
        if(ind > n-1)
        return 0;

        if(memo[ind] != -1)
        return memo[ind];

        int curr = Integer.MIN_VALUE;
        int curr2 = Integer.MIN_VALUE;
         curr = 0 + ans(nums,ind+1 , memo,n);
         curr2 = nums[ind] + ans(nums , ind+2 , memo,n);
        return memo[ind] = Math.max(curr , curr2);
    }
    public int rob(int[] nums) {
        int[] memo = new int[nums.length+1];
        Arrays.fill(memo , -1);
        int n = nums.length;
        return ans(nums , 0 , memo , n);
    }
}