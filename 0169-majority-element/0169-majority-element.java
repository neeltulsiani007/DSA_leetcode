class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int v = 1;
        for(int j=1;j<nums.length;j++)
        {
            int i = nums[j];
            if(v == 0)
            {
                candidate = i;
                v=1;
            }
            else if(i == candidate)
            v++;
            else
            v--;
        }
        return candidate;
    }
}