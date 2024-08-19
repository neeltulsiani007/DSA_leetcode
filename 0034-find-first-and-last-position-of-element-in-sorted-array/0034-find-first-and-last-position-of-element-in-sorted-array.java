class Solution {

    public int lb(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(arr[mid] >= target)
            {
                ans = mid;
                end = mid-1;
            }
            else
            start = mid+1;
        }
        return ans;
    }

    public int ub(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(arr[mid] > target)
            {
                ans = mid;
                end = mid-1;
            }
            else
            start = mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       int lb = lb(nums, target);

       if(lb == nums.length || lb == -1 || nums[lb] != target)
       return new int[]{-1,-1};

       return new int[]{lb , ub(nums,target)-1};
    }
}