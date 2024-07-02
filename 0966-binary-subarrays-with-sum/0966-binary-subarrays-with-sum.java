class Solution {
    public static int sliding(int[] arr , int goal)
    {
        int l =0;
        int i =0;
        int count = 0;
        int csum = 0;
        if(goal<0)
         return 0;

        while(i<arr.length)
        {
            csum += arr[i];

            while(csum > goal)
            {
                csum -= arr[l];
                l++;
            } 

            count+=i-l+1;
            i++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return sliding(nums , goal) - sliding(nums,goal-1);
    }
}