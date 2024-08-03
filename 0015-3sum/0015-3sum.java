class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        int i =0;
        int j = i+1;
        int k = nums.length-1;

        List<List<Integer>> l = new ArrayList<>();
        
        for( i = 0;i<nums.length;i++)
        {
             if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

             j = i+1;
             k = nums.length-1;
            while(j<k)
            {
                int total = nums[i] + nums[j] + nums[k];

                if(total > 0)
                {
                    k--;
                }
                else if(total < 0)
                {
                    j++;
                }
                else
                {
                    l.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(j<k && nums[j] == nums[j-1])
                    j++;
                }
            }
        }
        return l;
    }
}