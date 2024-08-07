class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int t = nums1.length+nums2.length;
        int c1 = -1, c2 = -1;
        int val1 = 0;
        int val2 = 0;
        int count = 0;

        if(t%2 == 0)
        {
            c2 = t/2;
            c1 = c2-1;
        }
        else
        c1= t/2;

        int i =0;
        int j =0;
        
        while(i<nums1.length && j<nums2.length)
        {

           // System.out.println(nums1[i] + " " + nums2[j]);

            if(nums1[i] <= nums2[j])
            {
                
                if(count == c1)
                {
                    val1 = nums1[i];
                 //   System.out.println(val1);
                }
                if(count == c2)
                {
                    val2 = nums1[i];
                }
                count++;
                i++;  
            }
            else
            {
                
                if(count == c1)
                {
                   
                    val1 = nums2[j];
                 //    System.out.println(val1);
                }
                if(count == c2)
                {
                    val2 = nums2[j];
                }
                count++;
                j++; 
            }
        }

        while(i<nums1.length)
        {
            
                if(count == c1)
                {
                    val1 = nums1[i];
                }
                if(count == c2)
                {
                    val2 = nums1[i];
                }
                count++;
                i++; 
        }

        while(j<nums2.length)
        {
             
                if(count == c1)
                {
                    val1 = nums2[j];
                }
                if(count == c2)
                {
                    val2 = nums2[j];
              //      System.out.println(val2);
                }
                count++;
                j++; 
        }

       if(val2 != 0)
       {
        return (double)(val1+val2)/2;
       }
       else
       return val1;
    }
}