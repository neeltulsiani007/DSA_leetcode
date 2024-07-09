class Solution {
    public int fun(int[] nums) {
      
        int n = nums.length;
        if(n == 1)
        return nums[0];
        if(n==2)
        return Math.max(nums[0] , nums[1]);

        int[] f = new int[n+1];
        f[1] = nums[0];
        f[2] = Math.max(nums[0] , nums[1]);

        for(int i = 3;i<=n;i++)
        {
            f[i] = Math.max(f[i-1] , f[i-2] + nums[i-1]);
        }

        return f[n];
    }

    public int rob(int[] nums) {

            int n = nums.length;
         if(n == 1)
        return nums[0];
        if(n==2)
        return Math.max(nums[0] , nums[1]);
        int n1[] = new int[nums.length-1];
        int n2[] = new int[nums.length-1];

        for(int i =0;i<nums.length-1;i++)
        {
            n1[i] = nums[i];
        }
        for(int i =1;i<nums.length;i++)
        {
            n2[i-1] = nums[i];
        }
        return Math.max(fun(n1) , fun(n2));
    }
}