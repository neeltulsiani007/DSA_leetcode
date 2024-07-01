class Solution {
    public boolean canJump(int[] nums) {
        
        if(nums.length == 0 || nums.length == 1)
        return true;

        if(nums.length > 1 && nums[0] == 0)
        return false;

        int reachable = nums[0];

        for(int i =1;i<nums.length;i++)
        {
            if(i>reachable)
            return false;
            else
            reachable = Math.max(reachable , i+nums[i]);
        }

        return true;
    }
}