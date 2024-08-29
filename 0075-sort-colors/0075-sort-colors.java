class Solution {
    public void sortColors(int[] nums) {
        
        int zeroindex = 0;
        int twoindex = nums.length-1;

        int i = 0;

        while(i<=twoindex)
        {
            if(nums[i] == 0)
            {
                int temp = nums[zeroindex];
                nums[zeroindex++] = nums[i];
                nums[i] = temp;
                  i++;
            }
            else if(nums[i] == 2)
            {
                int temp = nums[twoindex];
                nums[twoindex--] = nums[i];
                nums[i] = temp; 
            }
            else
            i++;
            
        }
    }
}