class Solution {

    public boolean least(int[] arr , int m , int k , int day)
    {
        int c = 0;
        int t = 0;

        for(int i : arr)
        {
            if(i < day)
            {
                c++;
            }
            else
            {
                t+=(c/k);
                c = 0;
            }
        }
        t+=c/k;
        return t>=m?true:false;
    }

    public int minDays(int[] arr, int m, int k) 
    {
        if(arr.length < m*k)
        return -1;
        
        int start = arr[0];
        int end = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i] > end)
            end = arr[i];
            if(arr[i] < start)
            start = arr[i];
        }
        int ans = 0;
        end+=1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(least(arr ,m,k,mid) == false)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
                ans = end;
            }
        } 

        return ans==0?-1:ans;
    }
}