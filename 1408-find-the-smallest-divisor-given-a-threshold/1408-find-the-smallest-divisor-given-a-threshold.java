class Solution {

    public int least(int[] arr , int thres , int mid)
    {
       int c = 0;

       for(int i : arr)
       {
        c+= Math.ceil((double)i / mid);
       // System.out.println(c);
       }
       //System.out.println(c +" "+mid);
       return c;
    }


    public int smallestDivisor(int[] arr, int thres) {
        

        int start =1;
        int end = arr[0];
        int ans = 0;

        for(int i : arr)
        end = Math.max(end , i);

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(least(arr , thres , mid) <= thres)
            {
            ans = mid;
            end = mid-1;
            }
            
            else
            {
                
                start = mid+1;
            }
        }

        return ans;
    }
}