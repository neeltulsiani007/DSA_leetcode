class Solution {
    public int majorityElement(int[] nums) {
        int can = nums[0];
        int vote = 0;
        for(int i : nums)
        {
            if(i == can)
            vote++;
            else
            vote--;

            if(vote == 0)
            {
                vote++;
                can = i;
            }
        }
        return can;
    }
}