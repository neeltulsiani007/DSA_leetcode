class Solution {

    public int sliding(int[] arr , int k)
    {

        if(k <= 0)
        return 0;

        int l =0;
        int i =0;
        int count = 0;
        Map<Integer , Integer> m = new HashMap<>();

        while(i<arr.length)
        {
            m.put(arr[i] , m.getOrDefault(arr[i],0)+1);

            while(m.size() > k)
            {
                m.put(arr[l] , m.get(arr[l])-1);
                if(m.get(arr[l]) == 0)
                m.remove(arr[l]);
                l++;
            }

            count+=i-l+1;
            i++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sliding(nums,k) - sliding(nums,k-1);
    }
}