class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        
        int n = 1<<(nums.length);

        for(int i = 0 ;i<n;i++)
        {
            List<Integer> t = new ArrayList<>();
            for(int j =0;j<nums.length;j++)
            {
                if((i&(1<<j)) > 0)
                t.add(nums[j]);
            }
            l.add(t);
        }
        return l;

    }
}