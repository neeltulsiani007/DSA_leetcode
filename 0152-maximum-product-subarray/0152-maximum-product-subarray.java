class Solution {
    public int maxProduct(int[] nums) {
        
        double max = Integer.MIN_VALUE;
        double prod = 1;

        for(int i : nums)
        {
            if(i == 0)
            {
                prod = 1;
                max = Math.max(0 , max);
                continue;
            }
            prod = (prod*i);
         //   System.out.println(prod);
            max = Math.max(prod , max);
        }
     //   System.out.println(max);

        prod = 1;

        for(int i = nums.length-1;i>=0;i--)
        {
            if(nums[i] == 0)
            {
                max = Math.max(0 , max);
                prod = 1;
                continue;
            }
            
            prod = (prod*nums[i]);
            max = Math.max(prod , max);
        }


        return (int)max;
    }
}