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
                if(c == k)
                {
                    t++;
                    c = 0;
                    continue;
                }
            }
            else
            {
                c = 0;
            }
        }
        return t>=m?true:false;
    }

    public int minDays(int[] arr, int m, int k) 
    {
        List<Integer> l = new ArrayList<>();
        for(int i : arr)
        l.add(i);
        int start = Collections.min(l);
        int end = Collections.max(l)+1;
        int ans = 0;

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