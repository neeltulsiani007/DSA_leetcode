class Solution {

    public static int sliding(int[] arr , int k)
    {

        if(k < 0)
        return 0;

        int l =0;
        int i =0;
        int c = 0;
        int oddcount = 0;

        while(i<arr.length)
        {
            if(arr[i] %2 != 0)
            oddcount++;
            
            while(oddcount > k)
            {
                if(arr[l] % 2 !=0)
                oddcount--;
                l++;
            }

            c+=i-l+1;
            i++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return sliding(nums,k) - sliding(nums,k-1);
    }
}