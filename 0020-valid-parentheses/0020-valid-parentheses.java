class Solution {
    public static boolean checkbrace(char c2 , char c1)
    {
        if(c1 == '(' && c2 == ')')
        {
            return true;
        }
        else if(c1 == '{' && c2 == '}')
        {
            return true;
        }
        else if(c1 == '[' && c2 == ']')
        {
            return true;
        }
        else
        return false;
    }
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '{' || c=='[')
            {
                st.push(c);
            }
            else if(c == ')' || c=='}' || c==']')
            {
                if(st.isEmpty())
                return false;
                System.out.println(c+" "+st.peek());
                if(checkbrace(c,st.peek()))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}