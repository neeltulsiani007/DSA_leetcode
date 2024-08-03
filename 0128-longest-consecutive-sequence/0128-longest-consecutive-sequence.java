class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s = new HashSet<Integer>();

        for(int i : nums)
        s.add(i);

        int max = 0;
        int c = 0;

        for(int i : nums)
        {
            c=0;
            if(!s.contains(i-1))
            {
                int t = i+1;
                c++;
                while(s.contains(t))
                {
                    t++;
                    c++;
                }
                max = Math.max(max,c);
            }
        }
        return max;

    }
}