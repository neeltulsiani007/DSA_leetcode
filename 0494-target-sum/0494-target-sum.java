class Solution {
    public int memo(int[] nums ,int ind, int target,int n)
    {
        if(ind == n){
        if(target == 0)
        return 1;
        else return 0;
        }
        return memo(nums , ind+1 , target-nums[ind] , n)+memo(nums , ind+1 , target+nums[ind] , n);
    }
    public int findTargetSumWays(int[] nums, int target) {

        return memo(nums,0,target,nums.length);
       
    }
}