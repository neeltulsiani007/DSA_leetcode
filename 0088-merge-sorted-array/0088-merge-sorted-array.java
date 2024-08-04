class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = 0;

        while(j<nums2.length && i>=0)
        {
            if(nums1[i] > nums2[j])
            {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                j++;
                i--;
            }
            else
            break;
        }
    

       Arrays.sort(nums1 ,0,m);
       Arrays.sort(nums2);

       for(int k = m;k<nums1.length;k++)
       nums1[k] = nums2[k-m];

    }
}