class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        Map<Integer , Integer> m = new HashMap<>();
        int pre = 0;
        int count = 0;
        for(int i =0;i<arr.length;i++)
        {
            pre+=arr[i];

            if(pre == goal)
            {
                count++;
            }

            if(m.containsKey(pre-goal))
            {
                count+=m.get(pre-goal);
                m.put(pre , m.getOrDefault(pre,0)+1);
            }
            else
            m.put(pre , m.getOrDefault(pre,0)+1);
        }
        return count;
    }
}