class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<asteroids.length;i++)
        {
            if(st.isEmpty())
            {
                st.push(asteroids[i]);
                continue;
            }
            int t = st.peek();
            if(asteroids[i] < 0 && t<0)
            {
                st.push(asteroids[i]);
                continue;
            }
            if(asteroids[i] > 0 && t>0)
            {
                st.push(asteroids[i]);
                continue;
            }
            if(asteroids[i] > 0 && t<0)
            {
                st.push(asteroids[i]);
                continue;
            }
            if(t>0 && asteroids[i]<0)
            {
                if(t> Math.abs(asteroids[i]))
                {
                    continue;
                }
                else if(t==Math.abs(asteroids[i]))
                {
                    st.pop();
                    continue;
                }
                else
                {
                    st.pop();
                    i--;
                    continue;
                }
            }
        }
        int t = st.size()-1;
        int ans[] = new int[st.size()];
        while(!st.isEmpty())
        {
            ans[t--] = st.pop();
        }
    return ans;
    }
}