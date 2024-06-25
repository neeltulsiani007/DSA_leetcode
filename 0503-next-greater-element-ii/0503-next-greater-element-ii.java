class Solution {
    public int[] nextGreaterElements(int[] nums2) {

        Stack<Integer> st = new Stack<>();
        int[] temp = new int[2*nums2.length];

        for(int j = 2*(nums2.length)-1 ;j>=0;j--)
        {
            int i = j%nums2.length;
            // System.out.println(st);
            if(st.isEmpty())
            {
                temp[j] = -1;
                st.push(nums2[i]);
                continue;
            }
            else
            {
                if(st.peek() > nums2[i])
                {
                    temp[j] = st.peek();
                    st.push(nums2[i]);
                }
                else
                {
                    while(!st.isEmpty() && st.peek() <= nums2[i] )
                    {
                        st.pop();
                    }
                    if(st.isEmpty())
                    {
                        temp[j] = -1;
                        st.push(nums2[i]);
                    }
                    else
                    {
                        temp[j] = st.peek();
                        st.push(nums2[i]);
                    }
                }
            }
        }
       
        int[] ans = Arrays.copyOf(temp , temp.length/2);
        return ans;
    }
}