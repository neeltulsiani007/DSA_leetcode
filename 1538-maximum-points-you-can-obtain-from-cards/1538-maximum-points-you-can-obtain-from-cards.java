class Solution {
    public int maxScore(int[] arr, int k) {
        

        int l = k-1;
        int sum = 0;
       
        for(int i = 0;i<k;i++)
        sum+=arr[i];
         int max = sum;

        // System.out.println(sum);

        for(int i = arr.length-1;i>=arr.length-k;i--)
        {
            //System.out.println(sum);
            sum = sum - arr[l] + arr[i];
            max = Math.max(max , sum);
            l--;
        }

        return max;
    }
}