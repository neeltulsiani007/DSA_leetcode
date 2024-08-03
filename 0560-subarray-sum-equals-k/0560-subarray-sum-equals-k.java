class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer , Integer> m = new HashMap<>();
        int prefix = 0;
        int s = 0;
        m.put(0,1);
        for(int i : nums)
        {
            prefix+=i;

            if(m.containsKey(prefix - k))
            {
                s+=m.get(prefix-k);
            }
    
            m.put(prefix , m.getOrDefault(prefix,0)+1);
        }

        return s; 
    }
}