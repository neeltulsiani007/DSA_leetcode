class Solution {

    public boolean check(int[] arr , int days , int mid)
    {
        int count = 0;
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum+=arr[i];

            if(sum <= mid)
            continue;
            else
            {
                count++;
                sum = arr[i];
            }
        }

        return (count+1)<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        
        int max =0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int i : weights)
        {
            sum+=i;
            max = Math.max(max , i);
        }

        int left = max;
        int right = sum;

        while(left <= right)
        {
            int mid = (left+right)/2;

            if(check(weights , days , mid))
            {
                ans = Math.min(mid , ans);
                right = mid-1;
            }
            else
            left = mid+1;

        }

        return ans;
    
    }
}