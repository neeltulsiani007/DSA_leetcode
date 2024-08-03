class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();

        for(int i =0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int max = 0;
        for(int x : s)
        {
            if(!s.contains(x-1))
            {
                int t= x+1; 
                int ans = 1;
                while(s.contains(t))
                {
                    t++;
                    ans++;
                }
                max = Math.max(ans , max);
            }
        }
        return max;
    }
}