class Solution {

    public int sliding(int[] arr , int goal)
    {

        int l =0;
        int r = 0;
        int count = 0;
        int sum = 0;
        int n = arr.length;

        if(goal < 0)
        return 0;

        while(r<n)
        {
            sum += arr[r];

            while(sum > goal)
            {
               sum-=arr[l];
               l++;
            }
            
            count+=r-l+1;

            r++;
        
        }

        return count;
    }
    public int numSubarraysWithSum(int[] arr, int goal) {
        
            return sliding(arr ,goal) - sliding(arr , goal-1);
    }
}