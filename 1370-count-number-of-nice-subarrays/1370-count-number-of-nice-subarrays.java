class Solution {

    public int sliding (int[] arr , int k)
    {
        int l = 0;
        int i = 0;
        int count = 0;
        int ans = 0;
        if(k<0)
        return 0;

        while(i<arr.length)
        {
            if(arr[i] % 2 != 0)
            count++;

            while(count > k)
            {
                if(arr[l] % 2 != 0)
                count --;
                l++;
            }

            ans += i-l+1;
            i++;
        }

        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        
        return sliding(nums , k) - sliding(nums , k-1);
    }
}