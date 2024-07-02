class Solution {
    public int longestOnes(int[] arr, int k) {
        int l = 0;
        int max=0;
        int r;
        int z = 0;

        for( r = 0;r<arr.length;r++)
        {
            if(arr[r] == 1)
            {
                continue;
            }
            else if(arr[r] == 0 && k!=z)
            {
                z++;
                continue;
            }
            else
            {
                //System.out.println(r);
                max = Math.max(max , r-l);
                while(arr[l] != 0)
                l++;
             
                l++;
            }
        }
        return Math.max(max,r-l);
    }
}