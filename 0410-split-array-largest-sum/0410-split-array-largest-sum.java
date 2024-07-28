class Solution {

    public boolean check(int[] nums , int k , int cap)
    {
        int s = 1;
        int temp = 0;

        for(int i : nums)
        {
            if(temp + i > cap)
            {
                s++;
                temp = i;
            }
            else
            temp+=i;
        }
        return s<=k;
    }

    public int splitArray(int[] nums, int k) {

        int max = nums[0];
        int sum = 0;

        for(int i : nums)
        {
            max = Math.max(i , max);
            sum+=i;
        }

        int start = max;
        int end = sum;
        int ans = 0;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(check(nums, k ,mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            start=mid+1;
        }

        return ans;
    }
}