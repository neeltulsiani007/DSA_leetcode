class Solution {

    public int longestOnes(int[] arr, int k) {
        

        int max = Integer.MIN_VALUE;
        int currmax = 0;

        int l = 0;

        int r = 0;
        

        for(r=0;r<arr.length;r++)
        {
            if(arr[r] == 0 && k == 0)
            {
                max = Math.max(max , r-l);
                while(arr[l] != 0)
                {
                    l++;
                }
                l++;
            }
            else
            {
                if(arr[r] != 1)
                k--;
            }
        }

        return Math.max(max , r-l);
    }
}