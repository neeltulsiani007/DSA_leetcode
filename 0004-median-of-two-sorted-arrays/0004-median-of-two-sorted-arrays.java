class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           
        int m = nums1.length;
        int n = nums2.length;  
        if (m > n) return findMedianSortedArrays(nums2, nums1); 
        int total = m+n;
        int tp = (total+1)/2;
        int low = 0;
        int high = m;


        while(low <= high)
        {
            int mid1 = (low+high)/2;
            int mid2 = tp - mid1;

            int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < m) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n && mid2>=0) ? nums2[mid2] : Integer.MAX_VALUE;

            if(l1 <= r2 && l2 <= r1)
            {
                if(total%2 == 0)
                {
                    int t1 = Math.max(l1,l2);
                    int t2 = Math.min(r1,r2);

                    return (double)(t1+t2)/2.0;

                }
                else
                {
                    return Math.max(l1,l2);
                }
            }
            else if(l1 > r2)
            {
                high = mid1-1;
            }
            else
            low = mid1+1;
        }
        return 0;   
    }
}