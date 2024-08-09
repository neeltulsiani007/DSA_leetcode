class Solution {
   
    public int jump(int[] nums) {
        
        if(nums.length == 1)
        return 0;

        int cm = 0;
        int ce = 0;

        int ans = 0;

        for(int i =0;i<nums.length-1;i++)
        {
            if(i+nums[i] > cm)
            cm = i+nums[i];

            if(i == ce)
            {
                ans++;
                ce = cm;
            }
        }
        return ans;
    }
}