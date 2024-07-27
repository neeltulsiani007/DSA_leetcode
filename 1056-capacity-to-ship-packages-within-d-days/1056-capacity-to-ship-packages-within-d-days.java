class Solution {

    public int least(int[] weights , int capacity)
    {
        int cap = 0;
        int days=0;

        for(int i = 0;i<weights.length;i++)
        {
            cap += weights[i];
            if(cap <= capacity)
            {
                continue;
            }
            else
            {
                days++;
                cap = weights[i];
            }
        }
      //  System.out.println(capacity +" "+ days);
        return days+1;
    }

    public int shipWithinDays(int[] weights, int days) {
        
        int max = weights[0];
        int sum = weights[0];

        for(int i =1;i<weights.length;i++)
        {
            if(weights[i] > max)
            max = weights[i];
            sum+=weights[i];
        }

        int start = max;
        int end = sum;
        int ans = Integer.MAX_VALUE;

        while(start <= end)
        {
            int mid = (start + end)/2;

            if(least(weights , mid) <= days)
            {
                ans = Math.min(ans ,mid);
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