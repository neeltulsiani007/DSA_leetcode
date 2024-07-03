class Solution {
    public int trap(int[] arr) {
        
        int lmax[] = new int[arr.length];
        int rmax[] = new int[arr.length];
        int cm = arr[0];
        lmax[0] = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i] > cm)
            {
                cm = arr[i];
                lmax[i] = cm;
            }
            else
            lmax[i] = cm;
        }

        cm = arr[arr.length -1];

        for(int i = arr.length-1;i>=0;i--)
        {
            if(arr[i] > cm)
            {
                cm = arr[i];
                rmax[i] = cm;
            }
            else
            rmax[i] = cm;
        }
        int ans = 0;

        for(int i =0;i<arr.length;i++)
        {
            ans+=Math.min(lmax[i],rmax[i]) - arr[i];
        }


        return ans;

    }
}