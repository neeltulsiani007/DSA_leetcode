class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int start = 0;
        int end = arr.length-1;

        if(arr[0] > k)
        {
            return k;
        }

        while(start <= end)
        {
            int mid = (start+end)/2;
            
            int missing = arr[mid] - (mid+1);

            if(missing < k)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }

        int ans = arr[end] + (k - (arr[end] - (end+1)));
        return ans;

    }
}