class Solution {

    public boolean ans(int[] arr , int ind , int sum , Boolean[][] memo)
    {
        if(sum == 0)
        return true;
        if(ind >= arr.length || sum < 0)
        return false;

        if(memo[ind][sum]!=null) return memo[ind][sum];

        boolean np = ans(arr , ind+1 , sum , memo);
        boolean p = false;
        if(sum - arr[ind] >=0)
        p = ans(arr , ind+1 , sum-arr[ind] , memo);

        return memo[ind][sum] = np || p;
    }
    public boolean canPartition(int[] nums) {
        
        int sum = 0;
        for(int i : nums)
        sum+=i;
        if(sum%2!=0) return false;

        Boolean[][] memo = new Boolean[nums.length+1][sum/2+1];

        return ans(nums , 0 , sum/2 , memo);
    }
}