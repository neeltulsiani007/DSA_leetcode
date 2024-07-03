class Solution {
    public int trap(int[] arr) {
        
        int lmax = 0;
        int rmax = 0;

        int l =0;
        int r = arr.length-1;
        int ans = 0;

        while(l<=r)
        {
            if(arr[l] <= arr[r])
            {
                if(arr[l] > lmax)
                lmax = arr[l];
                 else
                {
                ans+=lmax - arr[l];
                }
            l++;
            }
            else
            {
                if(arr[r] > rmax)
                rmax = arr[r];
                else
                {
                    ans+=rmax - arr[r];
                }
                r--;
            }   
        }
        return ans;
     
    }
}