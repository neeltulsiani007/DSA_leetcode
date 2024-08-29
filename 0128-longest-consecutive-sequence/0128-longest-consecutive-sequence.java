class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s = new HashSet<>();

        for(int i : nums)
        s.add(i);
        int ans = 0;
        int i = 0;

        while(i<nums.length)
        {
            if(s.contains(nums[i] -1)){
            i++;
            continue;
            }
            else
            {
                int c = 1;
                int x = nums[i];
                while(s.contains(x+1)){
                c++;
                x++;
                }
                ans = Math.max(ans,c);
            }
            i++;
        }
        return ans;
    }
}