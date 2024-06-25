public class Pair
{
    int key;
    int value;

    Pair(int key , int value)
    {
        this.key = key;
        this.value = value;
    }
    public int getKey()
    {
        return this.key;
    }
    public int getValue()
    {
        return this.value;
    }
}


class Solution {


    public int sumSubarrayMins(int[] arr) {
        
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int n = arr.length;
        Stack<Pair> st = new Stack<>();
        Stack<Pair> st2 = new Stack<>();

        for(int i =0;i<n;i++)
        {
            int c = 1;
            while(!st.isEmpty() && st.peek().getKey() > arr[i])
            {
                c+=st.peek().getValue();
                st.pop();
            }

            st.push(new Pair(arr[i] , c));
            left[i] = c;
        }
        st = st2;
        for(int i = n-1;i>=0;i--)
        {
            int c = 1;
             while(!st.isEmpty() && st.peek().getKey() >= arr[i])
            {
                c+=st.peek().getValue();
                st.pop();
            }
            st.push(new Pair(arr[i] , c));
            right[i] = c;
        }
        int answer = 0;
        int mod = (int) 1e9 + 7;
        for(int i =0;i<arr.length;i++)
        {
            answer += (long) (left[i]) * (right[i]) % mod * arr[i] % mod;
            answer %= mod;
        }
        return (int)answer;

    }
}