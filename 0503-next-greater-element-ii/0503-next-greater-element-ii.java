class Solution {
    public int[] nextGreaterElements(int[] nums2) {

        Stack<Integer> st = new Stack<>();
        int[] temp = new int[nums2.length];
        Arrays.fill(temp , -1);

        for(int j = 0 ;j<2*nums2.length;j++)
        {
            while(!st.isEmpty() && nums2[st.peek()] < nums2[j%nums2.length])
            {
                temp[st.pop()] = nums2[j%nums2.length];
            }
            if(j<nums2.length)
            st.push(j);
            //System.out.println(st);
        }
       

        return temp;
    }
}