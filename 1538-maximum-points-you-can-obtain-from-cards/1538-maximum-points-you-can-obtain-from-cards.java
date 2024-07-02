class Solution {
    public int maxScore(int[] arr, int k) {
        
        int lsum = 0;
        int rsum = 0;
        int c = 0;
        int i =0;
        int ans = 0;
        int j = arr.length-1;

        while(c!=k)
        {
            lsum+=arr[i];
            i++;
            c++;
        }
        ans = lsum;
     
        c =0;
        i = k-1;
        while(c!=k)
        {

            lsum-=arr[i];
            i--;
            rsum+=arr[j];
            j--;
            c++;
            ans = Math.max(lsum+rsum , ans);
        }
        return ans;
    }
}