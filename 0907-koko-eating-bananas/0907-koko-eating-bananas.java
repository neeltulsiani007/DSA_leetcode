class Solution {

    public int least(int[] arr , int h , int capacity)
    {
        int c = 0;
        int t = 0;

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] <= capacity)
            t++;
            else
            {
                t+= Math.ceil(((double)arr[i]/capacity)) ;
            }
        }
       // System.out.println((t) +" "+capacity);
        return t;
    }

    public int minEatingSpeed(int[] arr, int h) {
        int start = 1;
        int end = arr[0];
        int ans = 0;


        for(int i = 1; i<arr.length;i++)
        {
            if(arr[i] > end)
            end = arr[i];
        }

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(least(arr , h , mid) <= h)
            {
                ans= mid;
                end = mid-1;
            }
            else
            start=mid+1;
        }

    return ans;
    }
}